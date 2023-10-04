class Solution {
  public int firstUniqChar(String s) {
    Map<Character, Integer> seen = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char current = s.charAt(i);
      if (seen.containsKey(current)) {
        seen.put(current, seen.get(current) + 1);
      } else {
        seen.put(current, 1);
      }
    }

    for (int i = 0; i < s.length(); i++) {
      if (seen.get(s.charAt(i)) == 1) {
        return i;
      }
    }

    return -1;

  }
}

// Time O(s.length()) -> O(n)
// Space O(s.length()) -> O(n)