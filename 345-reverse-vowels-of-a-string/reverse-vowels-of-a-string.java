class Solution {
    public String reverseVowels(String s) {
        Map<Integer, Character> vowels = new HashMap<>();

        int vowelCount = 1;

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                vowels.put(vowelCount, s.charAt(i));
                vowelCount++;
            }
        }
        // this is to properly adjust the count back because on the last one we add even though there is not a next.
        vowelCount--;

        StringBuilder output = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                output.append(vowels.get(vowelCount));
                vowelCount--;
            } else {
                output.append(c);
            }
        }

        return output.toString();

    }

    public boolean isVowel(char c) {
        char converted = Character.toLowerCase(c);
        return converted == 'a' || converted == 'e' || converted == 'i' || converted == 'o' || converted == 'u';
    }
}

// Time O(s.length()) -> O(n)
// Space O(s.length()) - O(n)