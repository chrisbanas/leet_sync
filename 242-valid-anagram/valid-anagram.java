class Solution {
  public boolean isAnagram(String s, String t) {

    if (s.length() != t.length()) {
      return false;
    }

    int[] seen = new int[26];

    for (char letter : s.toCharArray()) {
      seen[letter - 'a']++;
    }

    for (char letter : t.toCharArray()) {
      seen[letter - 'a']--;
    }

    for (int num : seen) {
      if (num != 0) {
        return false;
      }
    }

    return true;

  }
}

// Time O(n) since we are only looking at strings of the same length
// Space O(1) since the array is always a fixed size of 26