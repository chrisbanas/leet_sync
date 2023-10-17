class Solution {
  public String replaceDigits(String s) {
    StringBuilder output = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      if (Character.isDigit(s.charAt(i))) {
        output.append((char) (s.charAt(i - 1) + Character.getNumericValue(s.charAt(i))));
      } else {
        output.append(s.charAt(i));
      }
    }

    return output.toString();
  }
}

// Time O(s.length()) -> O(n)
// Space O(s.length()) -> O(n)