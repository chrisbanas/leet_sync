class Solution {
  public String reverseWords(String s) {
    String[] words = s.split(" ");
    StringBuilder output = new StringBuilder();

    for (int i = 0; i < words.length ; i++) {
      if (i == words.length - 1) {
        output.append(reverseWord(words[i]));
      } else {
        output.append(reverseWord(words[i]));
        output.append(" ");
      }
    }

    return output.toString();
  }

  public String reverseWord(String s) {

    char[] reversed = s.toCharArray();

    for (int i = 0, j = reversed.length - 1; i < j; i++, j--) {
      char temp = reversed[i];
      reversed[i] = reversed[j];
      reversed[j] = temp;
    }

    return new String(reversed);

  }
}

// Time O(number of words in "s" + average length of words) -> O(m * n)
// Space O(number of words in "s" + average length of words) -> O(m * n)