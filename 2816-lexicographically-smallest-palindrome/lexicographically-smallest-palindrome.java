class Solution {
  public String makeSmallestPalindrome(String s) {
    char[] letters = s.toCharArray();

    for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
      if (letters[i] != letters[j]) {
        if (letters[i] < letters[j]) {
          letters[j] = letters[i];
        } else {
          letters[i] = letters[j];
        }
      }
    }

    return new String(letters);
  }
}

// Time O(s.length()) -> O(n)
// Space O(s.length()) -> O(n)