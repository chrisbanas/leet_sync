class Solution {
  public String toLowerCase(String s) {
    StringBuilder output = new StringBuilder();

    for (char letter : s.toCharArray()) {
      if (Character.isUpperCase(letter)) {
        output.append(Character.toLowerCase(letter));
      } else {
        output.append(letter);
      }
    }

    return output.toString();

  }
}

// Time O(s.length()) - O(n)
// Space O(s.length()) - O(n)