class Solution {
    public int lengthOfLastWord(String s) {
        int output = 0;
        boolean space = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && space) {
                break;
            } else if (s.charAt(i) != ' '){
                output++;
                space = true;
            }
        }

        return output;
    }
}