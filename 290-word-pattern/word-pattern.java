class Solution {
  public boolean wordPattern(String pattern, String s) {
    String[] words = s.split(" ");

    if (pattern.length() != words.length) {
      return false;
    }

    Map<Character, String> seen = new HashMap<>();

    for (int i = 0; i < pattern.length(); i++) {
      if (seen.containsValue(words[i]) && !seen.containsKey(pattern.charAt(i))) {
        return false;
      }
      if (seen.containsKey(pattern.charAt(i)) && !seen.get(pattern.charAt(i)).equals(words[i])) {
        return false;
      }
      seen.put(pattern.charAt(i), words[i]);
    }
    return true;
  }
}

// Time complexity wouldn't really be O(n). The containsValue() function takes O(n) time to find if the value exists which would run everytime inside the for loop which itself is O(n). So total time complexity would be O(n^2) I guess.