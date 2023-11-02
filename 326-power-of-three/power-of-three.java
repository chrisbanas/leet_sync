class Solution {
    public boolean isPowerOfThree(int n) {
        if ((n <= 0 || n % 3 != 0) && n != 1) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
}

// Time O(log(n))
// Space O(1)