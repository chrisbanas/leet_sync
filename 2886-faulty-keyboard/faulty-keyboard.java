class Solution {
  public String finalString(String s) {
    StringBuilder output = new StringBuilder();

    for (char c : s.toCharArray()) {
      if (c == 'i') {
        output = reverse(output);
      } else {
        output.append(c);
      }
    }

    return output.toString();
  }

  public StringBuilder reverse(StringBuilder s) {

    char[] letters = s.toString().toCharArray();

    for (int i = 0, j = letters.length - 1; i < j; i++, j--) {
      char temp = letters[i];
      letters[i] = letters[j];
      letters[j] = temp;
    }

    return new StringBuilder(new String(letters));

  }
}

// Time O(s.length()) -> O(n)
// Space O(s.length()) -> O(n)