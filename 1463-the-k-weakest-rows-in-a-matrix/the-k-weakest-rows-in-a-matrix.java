class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> minQueue = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });

        for (int i = 0; i < mat.length; i++) {
            int soldiers = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    soldiers++;
                } else {
                    break;
                }
            }
            minQueue.add(new int[]{soldiers, i});
        }

        int[] output = new int[k];

        for (int i = 0, j = k; !minQueue.isEmpty() && j > 0; i++, j--) {
            output[i] = minQueue.poll()[1];
        }
        
        return output;
    } 
}
    // Time O(n log(n)) for the loop and adding to the queue.
    // Space O(mat.length) -> O(n)