class Solution {
  private boolean visited[][];

  public boolean exist(char[][] board, String word) {
    int rows = board.length;
    int columns = board[0].length;

    visited = new boolean[rows][columns];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        if (word.charAt(0) == board[i][j] && dfs(i, j, 0, word, board)) {
          return true;
        }
      }
    }

    return false;
  }

  private boolean dfs(int i, int j, int index, String word, char[][] board) {
    if (index == word.length()) {
      return true;
    }

    if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || word.charAt(index) != board[i][j] || visited[i][j]) {
      return false;
    }

    visited[i][j] = true;

    if (dfs(i + 1, j, index + 1, word, board) ||
        dfs(i - 1, j, index + 1, word, board) ||
        dfs(i, j + 1, index + 1, word, board) ||
        dfs(i, j - 1, index + 1, word, board)) {

      return true;
    }

    visited[i][j] = false;
    return false;
  }
}

/*

DFS

Time O((m * n) * 3^l) where m and n are the dimensions of the board, and l is the length of the word to be found. 
Space O(m * n)

*/