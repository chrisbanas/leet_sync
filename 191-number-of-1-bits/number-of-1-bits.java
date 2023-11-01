public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int output = 0;
        while (n != 0) {
            output += (n & 1);
            n >>>= 1;
        }
        return output;
    }
}

// https://www.interviewcake.com/concept/java/bit-shift

// Time and Space are O(1)