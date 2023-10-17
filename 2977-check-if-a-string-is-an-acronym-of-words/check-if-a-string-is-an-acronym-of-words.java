class Solution {
  public boolean isAcronym(List<String> words, String s) {

    if (s.length() != words.size()) {
      return false;
    }

    int i = 0;

    for (String word : words) {
      if (word.charAt(0) != s.charAt(i)) {
          return false;
      }
      i++;
    }

    return true;
  }
}

// Time O(words.size()) -> O(n)
// Space O(1)