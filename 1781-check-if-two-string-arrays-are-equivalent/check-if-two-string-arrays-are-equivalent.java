class Solution {
  public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    String combined1 = String.join("", word1);
    String combined2 = String.join("", word2);

    return combined1.equals(combined2);

  }
}

  // Time O(word1.length + word2.length) -> O(n + m)
  // Space O(1)