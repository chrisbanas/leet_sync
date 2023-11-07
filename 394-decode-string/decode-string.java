class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> strings = new Stack<>();
        Stack<Integer> counts = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;
        
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + ch - '0';
            } else if (ch == '[') {
                counts.push(k);
                strings.push(current);
                current = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                StringBuilder decodedString = strings.pop();
                for (int currentK = counts.pop(); currentK > 0; currentK--) {
                    decodedString.append(current);
                }
                current = decodedString;
            } else {
                current.append(ch);
            }
        }
        
        return current.toString();
    }
}

// Time O(max(n, m))
// Space O(n + m)