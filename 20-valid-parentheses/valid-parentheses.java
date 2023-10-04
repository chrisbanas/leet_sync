class Solution {
  public boolean isValid(String s) {

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char current = s.charAt(i);
      if (current == '(' || current == '[' || current == '{') {
        stack.add(current);
      } else if (!stack.isEmpty() && validPair(stack.peek(), current)) {
        stack.pop();
      } else {
        return false;
      }
    }

    return stack.isEmpty();

  }

  public boolean validPair(char c1, char c2) {
    if (c1 == '(' && c2 == ')' || c1 == '[' && c2 == ']' || c1 == '{' && c2 == '}') {
      return true;
    } else {
      return false;
    }
  }

}

// Time O(s.length()) -> O(n)
// Space O(s.length()) -> O(n)