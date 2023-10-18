class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder output = new StringBuilder();

        int i = 0;
        int j = 0;

        while (i < word1.length() || j < word2.length()) {
            if (i == word1.length() && j != word2.length()) {
                output.append(word2.charAt(j));
                j++;
            } else if (j == word2.length() && i != word1.length()) {
                output.append(word1.charAt(i));
                i++;
            } else {
                output.append(word1.charAt(i));
                output.append(word2.charAt(j));
                i++;
                j++;
            }
        }

        return output.toString();
    }
}

    // Time is O(n) of the longer of the two strings
    // Space is O(word1.length() + word2.length()) - O(n)