/*
So immeditlly we know the length is the minimum answer

This may be inefficent but we need each substring and then reverse it and then check if the equal

*/


class Solution {
    public int countSubstrings(String s) {
        int output = 0;

        for (int i = 0; i < s.length(); i++) {
            output += count(s, i, i);
            output += count(s, i, i + 1);
        }

        return output;
    }

    public int count(String s, int low, int high) {
        int output = 0;

        while (low >= 0 && high < s.length()) {
            if (s.charAt(low) != s.charAt(high)) {
                break;
            }
            low--;
            high++;
            output++;
        }

        return output;

    }
}

// Time O(n^2)
// Space O(1)