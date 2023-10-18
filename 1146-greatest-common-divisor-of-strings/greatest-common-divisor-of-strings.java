class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // THis makes sure only perfect patterns exist
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    // This calculates the area of the substring of the greatest common divisor
    public int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }
}

// Time O(str1.length() + str2.length()) -> O(m + n)
// Space O(str1.length() + str2.length()) -> O(m + n)