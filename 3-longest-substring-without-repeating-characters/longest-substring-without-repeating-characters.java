class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int longest = 0;

        for (int i = 0; i < s.length(); i++) {
            int tempLongest = 0;
            Set<Character> bank = new HashSet<>();

            for (int j = i; j < s.length(); j++) {
                if (bank.contains(s.charAt(j))) {
                    break;
                } else {
                    bank.add(s.charAt(j));
                    tempLongest++;
                }
            }

            if (tempLongest > longest) {
                longest = tempLongest;
            }

        }

        return longest;
    }
        
}