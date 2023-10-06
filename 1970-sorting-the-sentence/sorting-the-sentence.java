class Solution {
  public String sortSentence(String s) {
    String[] words = s.split(" ");
    String[] reorderedWords = new String[words.length];

    for (int i = 0; i < reorderedWords.length; i++) {
      reorderedWords[Character.getNumericValue(words[i].charAt(words[i].length() - 1)) - 1] = words[i].substring(0, words[i].length() - 1);
    }


    StringBuilder output = new StringBuilder();

    for (int i = 0; i < reorderedWords.length; i++) {
      if (i == reorderedWords.length - 1) {
        output.append(reorderedWords[i]);
      } else {
        output.append(reorderedWords[i]);
        output.append(" ");
      }
    }

    return output.toString();

  }
}