class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List<List<Integer>> adjacent = new ArrayList<>(numCourses);

        for (int i = 0; i < numCourses; i++) {
            adjacent.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            adjacent.get(prerequisite[1]).add(prerequisite[0]);
            indegree[prerequisite[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        int[] topologicalOrder = new int[numCourses];
        int index = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            topologicalOrder[index++] = node;

            for (int neighbor : adjacent.get(node)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        if (index == numCourses) {
            return topologicalOrder;
        } else {
            return new int[0]; // return an empty array if not all courses can be finished
        }
    }
}

// Time O(vertex + edge)
// Space O(vertex + edge)