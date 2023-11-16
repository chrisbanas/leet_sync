class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }

        int twoBack = 1;
        int oneBack = 1;

        for (int i = 1; i < s.length(); i++) {
            int current = 0;

            if (s.charAt(i) != '0') {
                current = oneBack;
            }

            int twoDigit = Integer.parseInt(s.substring(i - 1, i + 1));

            if (twoDigit >= 10 && twoDigit <= 26) {
                current += twoBack;
            }

            twoBack = oneBack;
            oneBack = current;
        }

        return oneBack;
    }
}

// Time O(n)
// Space O(1)

/*
Substring is called in each iteration of the loop with a substring length of 2 (s.substring(i - 1, i + 1)). This means that in each iteration, a new string of length 2 is created, which is an O(1) operation since the size of the substring is constant and does not depend on the input size.

*/