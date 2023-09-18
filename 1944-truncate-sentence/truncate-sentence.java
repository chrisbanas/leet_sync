class Solution {
    public String truncateSentence(String s, int k) {
            int truncateIndex = 0;
        int spacesCount = 0;

        while (spacesCount < k && truncateIndex < s.length()) {
            if (s.charAt(truncateIndex) == ' ') {
                spacesCount++;
            }
            truncateIndex++;
        }

        if (spacesCount == k) {
            return s.substring(0, truncateIndex - 1);
        } else {
            return s.substring(0, truncateIndex);
        }
    }
}