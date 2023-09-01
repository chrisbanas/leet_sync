class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int ruleIndex = 0;

        if (ruleKey.equals("type")) {
            ruleIndex = 0;
        } else if (ruleKey.equals("color")) {
            ruleIndex = 1;
        } else if (ruleKey.equals("name")) {
            ruleIndex = 2;
        }

        int count = 0;
        
        for (List<String> item : items) {
            if (item.get(ruleIndex).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}

// The reason my code was not working was I was using "==" instead of ".equals"

// Time O(n) as we iterate over all items in the list
// Space O(1) as we only use constant variables