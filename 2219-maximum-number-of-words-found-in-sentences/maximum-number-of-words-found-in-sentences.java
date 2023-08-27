class Solution {
    public int mostWordsFound(String[] sentences) {
        int longest = 0;

        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            int numWords = words.length;
            if (numWords > longest) {
                longest = numWords;
            }
        }

        return longest;
    }
}