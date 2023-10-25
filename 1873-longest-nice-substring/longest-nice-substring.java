class Solution {
  public String longestNiceSubstring(String s) {
    if (s.length() < 2) {
      return "";
    }

    Set<Character> seen = new HashSet<>();
    char[] letters = s.toCharArray();

    for (char c : letters) {
      seen.add(c);
    }

    for (int i = 0; i < letters.length; i++) {
      char c = letters[i];
      if (seen.contains(Character.toUpperCase(c)) && seen.contains(Character.toLowerCase(c))) {
        continue;
      }

      String sub1 = longestNiceSubstring(s.substring(0, i));
      String sub2 = longestNiceSubstring(s.substring(i + 1));
      return sub1.length() >= sub2.length() ? sub1 : sub2;
    }

    return s;
    
  }
}

// Time O(n2) because of the s.substring
// Space O(n)