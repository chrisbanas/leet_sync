class Solution {
    public List<String> cellsInRange(String s) {

        int startRowNumber = Character.getNumericValue(s.charAt(1));
        int endRowNumber = Character.getNumericValue(s.charAt(4));

        char startColumnLetter = s.charAt(0);
        char endColumnLetter = s.charAt(3);

        List<String> output = new ArrayList<>();

        for (char column = startColumnLetter; column <= endColumnLetter; column++) {
            for (int i = startRowNumber; i <= endRowNumber; i++) {
                output.add(column + String.valueOf(i));
            }
        }

        return output;
        
    }
}

// Time O(row * columns) -> O(n * m)
// Space O(1) since the array list is used in the output