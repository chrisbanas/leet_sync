class Solution {
    public int balancedStringSplit(String s) {
        int output = 0;
        int countR = 0;
        int countL = 0;

        char[] letters = s.toCharArray();

        for (char letter : letters) {
        if (letter == 'R') {
            countR++;
        }

        if (letter == 'L') {
            countL++;
        }

        if (countR == countL) {
            output++;
            countR = 0;
            countL = 0;
        }
        }

        return output;
    }
}