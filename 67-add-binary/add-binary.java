import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger aBigInteger = new BigInteger(a, 2);
        BigInteger bBigInteger = new BigInteger(b, 2);
        BigInteger sum = aBigInteger.add(bBigInteger);
        return sum.toString(2);
    }
}

// Time O(1)
// Space O(1)