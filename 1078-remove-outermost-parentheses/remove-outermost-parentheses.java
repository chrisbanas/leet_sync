class Solution {
  public String removeOuterParentheses(String s) {
    int count = 0;
    StringBuilder output = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      char current = s.charAt(i);
      if (current == '(') {
        if (count != 0) {
          output.append(current);
        }
        count++;
      } else {
        if (count != 1) {
          output.append(current);
        }
        count--;
      }
    }

    return output.toString();
  }
}

// Time O(s.length()) -> O(n)
// Space O(s.length()) -> O(n)