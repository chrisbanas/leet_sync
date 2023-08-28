class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // The trick with this one was to sort it. That way the first and last word in the array are the shortest and longest in the perfect alphabetical setup. If thier first letter is different then we know there is no longest common prefix because every word in the array has to start with the same letter for there to be one.

        Arrays.sort(strs);

        //Shortest String
        String shortest = strs[0];
        
        //Longest String
        String longest = strs[strs.length - 1];



        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < shortest.length(); i++) {
            if (shortest.charAt(i) == longest.charAt(i)) {
                prefix.append(shortest.charAt(i));
            } else {
                break;
            }
        }

        String commonPrefix = prefix.toString();

        return commonPrefix;

    }
}