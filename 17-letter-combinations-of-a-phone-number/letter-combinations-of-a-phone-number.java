class Solution {
     public List<String> letterCombinations(String digits) {
        LinkedList<String> output = new LinkedList<>();

        if (digits.length() == 0) {
            return output;
        }

        output.add("");

        String[] charMap = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for (int i = 0; i < digits.length(); i++) {
            int j = Character.getNumericValue(digits.charAt(i));

            while (output.peek().length() == i) {
                StringBuilder permutation = new StringBuilder(output.remove());

                for (char c : charMap[j].toCharArray()) {
                    output.add(String.valueOf(permutation) + c);
                }
            }
        }

        return output;
    }
}

/* 

BFS

Both the time and space complexity are O(k^n), where k is the average number of characters a digit can represent, and n is the length of the input string. 

*/