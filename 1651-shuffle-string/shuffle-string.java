class Solution {
    public String restoreString(String s, int[] indices) {

        StringBuilder string = new StringBuilder(s);

        for(int i = 0; i < s.length(); i++){
            string.setCharAt(indices[i],s.charAt(i));
        }
        
        return String.valueOf(string);

    }
}

// This is the correct solution LeetCode has a typo in one of thier test cases

/*
public String restoreString(String s, int[] indices) {
        char[] letters = s.toCharArray();
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < indices.length; i++) {
            newString.append(letters[indices[i]]);
        }

        return newString.toString();
}
*/

// Time O(n) because we iterate over each of the indices once
// Space O(n) for the char array of length s