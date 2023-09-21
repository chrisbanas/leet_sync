class Solution {
    public int lengthOfLongestSubstring(String s) {
    
        int i = 0;
        int longestCount = 0;

        while (i < s.length()) {
            Map<Character, Boolean> bank = new HashMap<>();
            int tempCount = 0;
            int j = i;
                while (j < s.length()) {
                    char currentChar = s.charAt(j);
                    if (!bank.containsKey(currentChar)) {
                        tempCount++;
                        bank.put(currentChar, true);
                    } else {
                        break;
                    }
                        j++;
                }

            if (longestCount < tempCount) {
                longestCount = tempCount;
            }
            i++;

        }

        return longestCount;

    }
}

// Time O(s.length()) -> O(n)
// Space O(s.length()) -> O(n)