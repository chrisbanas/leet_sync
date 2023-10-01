class Solution {
    public int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        int ways = 0;

        int twoBack = 1;
        int oneBack = 2;

        for (int i = 3; i <= n; i++) {
            ways = twoBack + oneBack;
            twoBack = oneBack;
            oneBack = ways;
        }

        return ways;
    }
}