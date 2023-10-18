class Solution {
    public int[] countBits(int n) {
        int[] output = new int[n + 1];
        for (int x = 0; x <= n; x++) {
            output[x] = popCount(x);
        }

        return output;
    }

    private int popCount(int x) {
        int count;
        for (count = 0; x != 0; count++) {
            x &= x - 1;
        }

        return count;
    }
}

// Time O(n⋅logn)
// Space O(1)