// "D" stands for decreasing starting at s.length
// "I" stands for increasing starting at 0
// If the last value is a "D" we add one more additional decrease if it is an "I" then one more additional increase

class Solution {
    public int[] diStringMatch(String s) {
        int[] result = new int[s.length() + 1];

        int increase = 0;
        int decrease = s.length();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                result[i] = increase;
                increase++;
            } else {
                result[i] = decrease;
                decrease--;
            }
        }

        if (s.charAt(s.length() - 1) == 'I') {
            result[s.length()] = increase;
        } else {
            result[s.length()] = decrease;
        }

        return result;

    }
}