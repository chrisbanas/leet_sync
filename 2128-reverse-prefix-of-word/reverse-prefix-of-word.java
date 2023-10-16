class Solution {
    public String reversePrefix(String word, char ch) {
        int firstOccurrence = word.indexOf(ch);

        if (firstOccurrence == -1) {
            return word;
        }
        
        StringBuilder output = new StringBuilder();

        for (int i = firstOccurrence; i >= 0; i--) {
            output.append(word.charAt(i));
        }

        for (int i = firstOccurrence + 1; i < word.length(); i++) {
            output.append(word.charAt(i));
        }

        return new String(output);

    }
}