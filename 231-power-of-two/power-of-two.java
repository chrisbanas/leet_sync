class Solution {
    public boolean isPowerOfTwo(int n) {
        // Base Case
        if (n == 1) {
            return true;
        }

        // Second Base Case
        if (n == 0 || n % 2 != 0) {
            return false;
        }

        // Recursive Step
        return isPowerOfTwo(n / 2);
    }
}

// Time O(log(n))
// Space O(n)