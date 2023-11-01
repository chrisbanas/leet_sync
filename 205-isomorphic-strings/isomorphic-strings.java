class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] seenS = new int[200];
        int[] seenT = new int[200];

        for(int i = 0; i < s.length(); i++) {
            if(seenS[s.charAt(i)] != seenT[t.charAt(i)])
                return false;

            seenS[s.charAt(i)] = i + 1;
            seenT[t.charAt(i)] = i + 1;
        }
        return true;
    }
}

// Time O(s.length()) -> O(n)
// Space O(s.length() + t.length()) -> O(n + m)