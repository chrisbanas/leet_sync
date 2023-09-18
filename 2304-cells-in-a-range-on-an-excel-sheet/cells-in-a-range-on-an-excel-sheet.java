class Solution {
    public List<String> cellsInRange(String s) {
        int startRowNumber = Character.getNumericValue(s.charAt(1));
        int endRowNumber = Character.getNumericValue(s.charAt(4));

        char startColumnLetter = s.charAt(0);
        char endColumnLetter = s.charAt(3);

        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int startLetterIndex = alpha.indexOf(startColumnLetter);
        int endLetterIndex = alpha.indexOf(endColumnLetter);

        int tempRowNumber = startRowNumber;

        List<String> output = new ArrayList<>();

        while (startRowNumber <= endRowNumber && startLetterIndex <= endLetterIndex) {
            output.add(alpha.charAt(startLetterIndex) + String.valueOf(tempRowNumber));
            tempRowNumber++;
            if (tempRowNumber > endRowNumber) {
                tempRowNumber = startRowNumber;
                startLetterIndex++;
            }
        }

        return output;
    }
}

// Time O(row * columns) -> O(n * m)
// Space O(1) since the array list is used in the output