class Solution {
  public int countConsistentStrings(String allowed, String[] words) {
    Set<Character> seen = new HashSet<>();

    for (char c : allowed.toCharArray()) {
      seen.add(c);
    }

    int output = 0;

    for (String word : words) {
      boolean consistent = true;
      for (char c : word.toCharArray()) {
        if (!seen.contains(c)) {
          consistent = false;
          break;
        }
      }

      if (consistent) {
        output++;
      }

    }

    return output;

  }
}

// Time O(allowed.length() + words.length) -> O(m + n)
// Space O(allowed.length()) -> O(n)