class Solution {
    public boolean isPalindrome(String s) {
        if (s == " ") {
            return true;
        }

        char[] letters = s.toCharArray();

        StringBuilder newWord = new StringBuilder();

        for (char letter : letters) {
            if (Character.isLetterOrDigit(letter)) {
                newWord.append(Character.toLowerCase(letter));
            }
        }

        int i = 0;
        int j = newWord.length() - 1;

        while (i < j) {
            if (newWord.charAt(i) != newWord.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}