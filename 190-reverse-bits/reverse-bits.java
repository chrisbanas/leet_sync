public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ret = 0;
        int power = 31;

        while (n != 0) {
            ret += (n & 1) << power; // Shift the bit to the correct reversed position
            n = n >>> 1;             // Unsigned right shift operator
            power -= 1;
        }
        return ret;
    }
}

// Time and Space O(1)