class Solution {
    public boolean isPowerOfFour(int n) {
        if ((n <= 0 || n % 4 != 0) && n != 1) {
            return false;
        }

        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }
}

// Time O(log(n))
// Space O(1)