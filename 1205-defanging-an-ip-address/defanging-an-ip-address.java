class Solution {
    public String defangIPaddr(String address) {
        char[] characters = address.toCharArray();
        StringBuilder defanged = new StringBuilder();

        for (char character: characters) {
            if (character == '.') {
                defanged.append("[" + character + "]");
            } else {
                defanged.append(character);
            }
        }

        return defanged.toString();
    }
}