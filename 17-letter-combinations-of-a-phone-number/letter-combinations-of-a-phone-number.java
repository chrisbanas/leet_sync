class Solution {
    private List<String> combinations = new ArrayList<>();
    private Map<Character, String> letters = Map.of('2', "abc", '3', "def", '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");
    private String phoneDigits;

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return combinations;
        }

        phoneDigits = digits;
        dfsBackTrack(0, new StringBuilder());
        return combinations;

    }

    private void dfsBackTrack(int i, StringBuilder path) {
        if (path.length() == phoneDigits.length()) {
            combinations.add(path.toString());
            return;
        }

        String possibleLetters = letters.get(phoneDigits.charAt(i));

        for (char letter : possibleLetters.toCharArray()) {
            path.append(letter);
            dfsBackTrack(i + 1, path);
            path.deleteCharAt(path.length() - 1);
        }

    }
}

/* 

DFS

The time complexity is how many combinations we can have. So test one is 9 as 2 & 3 have 3 letters each, so 3 * 3
The length of the output stings will be the same as the input strings.

*/