class Solution {
    public int countAsterisks(String s) {

        boolean countable = true;
        int output = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                countable = !countable;
            }
            if (countable && s.charAt(i) == '*'){
                output++;
            }
        }

        return output;
        
    }
}