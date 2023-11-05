class Solution {
    public int i = 0;
    public String decodeString(String s) {
        StringBuilder output = new StringBuilder();

        while(i < s.length() && s.charAt(i) != ']') {
            if (!Character.isDigit(s.charAt(i))) {
                output.append(s.charAt(i++));
            } else {
                int k = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    k = k * 10 + s.charAt(i++) - '0';
                }
                i++;
                String decodedString = decodeString(s);
                while (k-- > 0) {
                    output.append(decodedString);
                }
            }
        }
        i++;
        return output.toString();
    }
}

// Time O(maxK * n)
// Space O(n)