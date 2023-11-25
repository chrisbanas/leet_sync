class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return 0;
        }

        int[][] cache = new int[matrix.length][matrix[0]. length];
        int output = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0]. length; j++) {
                output = Math.max(output, dfs(matrix, i, j, cache));
            }
        }

        return output;
    }

    private int dfs(int[][] matrix, int i, int j, int[][] cache) {
        if (cache[i][j] != 0) {
            return cache[i][j];
        }

        int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        for (int[] d : dirs) {
            int x = i + d[0];
            int y = j + d[1];
            if (0 <= x && x < matrix.length && 0 <= y && y < matrix[0]. length && matrix[x][y] > matrix[i][j]) {
                cache[i][j] = Math.max(cache[i][j], dfs(matrix, x, y, cache));
            }
        }

        return ++cache[i][j];
    }
}

// Time O(m*n)
// Space O(m*n)