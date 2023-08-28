class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // The trick with this one was to sort it. That way the first and last word in the array are the shortest and longest in the perfect alphabetical setup. If thier first letter is different then we know there is no longest common prefix because every word in the array has to start with the same letter for there to be one.

        Arrays.sort(strs);

        //Shortest String
        String first = strs[0];
        
        //Longest String
        String last = strs[strs.length - 1];


        int i = 0;

        while (i < first.length() && first.charAt(i) == last.charAt(i)) {
           i++;
        }

        if (i == 0) {
            return "";
        } else {
            return first.substring(0, i);
        }

        
        

    }
}