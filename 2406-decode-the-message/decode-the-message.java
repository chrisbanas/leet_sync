class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> substitutionTable = new HashMap<>();

        char alphabetCounter = 'a';

        for (int i = 0; i < key.length(); i++) {
            if (!substitutionTable.containsKey(key.charAt(i)) && key.charAt(i) != ' ') {
                substitutionTable.put(key.charAt(i), alphabetCounter++);
            }
        }

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != ' ') {
                output.append(substitutionTable.get(message.charAt(i)));
            } else {
                output.append(' ');
            }
        }

        return new String(output);
    }
}