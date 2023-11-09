class Solution {
    public boolean canTransform(String start, String end) {

        int lSwap = 0;
        int rSwap = 0;

        for (int i = 0; i < start.length(); i++) {
            char c1 = start.charAt(i);
            char c2 = end.charAt(i);

            if ((c1 == 'L' && rSwap != 0) || (c1 == 'R' && lSwap != 0)) {
                return false;
            }

            if (c1 == 'L') lSwap--;
            if (c2 == 'L') lSwap++;
            if (c1 == 'R') rSwap++;
            if (c2 == 'R') rSwap--;

            if (lSwap < 0 || rSwap < 0) {
                return false;
            }
        }

        return lSwap == 0 && rSwap == 0;

    }
}

// Time O(n)
// Space O(1)