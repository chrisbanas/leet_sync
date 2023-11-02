class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        return n % 2 == 0 || n == 1;
    }
}

// Time O(log(n))
// Space O(1)