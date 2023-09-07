// start at index two and then always look back two, but increment 1 checking to make sure each char at all three indexes is unique.


class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1) && s.charAt(i) != s.charAt(i - 2) && s.charAt(i - 1) != s.charAt(i - 2)) {
                count ++;
            }
        }

        return count;
    }
}