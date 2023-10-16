class Solution {
  public int maxDepth(String s) {
    int tempDepth = 0;
    int depth = 0;

    for (int i = 0; i < s.length(); i++) {
      char current = s.charAt(i);
      if (current == '(') {
        tempDepth++;
        if (tempDepth > depth) {
          depth = tempDepth;
        }
      } else if (current == ')') {
        tempDepth--;
      }
    }

    return depth;
  }
}

  // Time O(s.length()) -> O(n)
  // Space O(1)