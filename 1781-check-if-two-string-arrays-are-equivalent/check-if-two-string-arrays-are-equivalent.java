class Solution {
  public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    StringBuilder combined1 = new StringBuilder();
    StringBuilder combined2 = new StringBuilder();

    for (String word: word1) {
      combined1.append(word);
    }

    for (String word: word2) {
      combined2.append(word);
    }

    return combined1.toString().equals(combined2.toString());

  }
}

  // Time O(word1.length + word2.length) -> O(n + m)
  // Space O(word1.length + word2.length) -> O(n + m)