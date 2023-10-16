class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] deCoder = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Map<Character, String> morseCodeMap = new HashMap<>();
        char startChar = 'a';
        for (int i = 0; i < deCoder.length; i++) {
            morseCodeMap.put(startChar, deCoder[i]);
            startChar++;
        }



        Set<String> seen = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            StringBuilder codedWord = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
                codedWord.append(morseCodeMap.get(words[i].charAt(j)));
            }
            seen.add(new String(codedWord));
        }
        
        return seen.size();
    }
}