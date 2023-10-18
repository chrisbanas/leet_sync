class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;

        char[] letters = s.toCharArray();

        while (i < j) {
            if (isVowel(letters[i]) && isVowel(letters[j])) {
                char temp = letters[i];
                letters[i] = letters[j];
                letters[j] = temp;
                i++;
                j--;
            } else if (!isVowel(letters[i])) {
                i++;
            } else if (!isVowel(letters[j])) {
                j--;
            }
        }

        return new String(letters);
    }

    public boolean isVowel(char c) {
        char converted = Character.toLowerCase(c);
        return converted == 'a' || converted == 'e' || converted == 'i' || converted == 'o' || converted == 'u';
    }
}

// Time O(s.length()) -> O(n)
// Space O(s.length()) - O(n)