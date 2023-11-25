class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List<List<Integer>> adjacent = new ArrayList<>(numCourses);

        // For evey course add a list to the adjacent matrix
        for (int i = 0; i < numCourses; i++) {
            adjacent.add(new ArrayList<>());
        }
        
        for (int[] prerequisite : prerequisites) {
            adjacent.get(prerequisite[1]).add(prerequisite[0]);
            indegree[prerequisite[0]]++;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        
        // Push all the nodes with an indegree zero in the queue
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }
        
        int nodesVisited = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            nodesVisited++;
            
            for (int neighbor : adjacent.get(node)) {
                // Delete the edge node -> neighbor
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }
        
        return nodesVisited == numCourses;
    }
}

// Time O(m + n)
// Space O(m + n)