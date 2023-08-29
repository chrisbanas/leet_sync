
// Base Case
// Recurrence Relation


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();

        // Add the first number (Base Case)
        pascalsTriangle.add(new ArrayList<>(Arrays.asList(1)));

        for (int row = 1; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();
            List<Integer> previousRow = pascalsTriangle.get(row - 1);
            
            // Every row starts with 1
            currentRow.add(1);

            // Recurrence Relation
            for (int col = 1; col < previousRow.size(); col++) {
                currentRow.add(previousRow.get(col - 1) + previousRow.get(col));
            }


            // Every row ends with 1
            currentRow.add(1);

            // We add the new row to the triangle
            pascalsTriangle.add(currentRow);
        }

        return pascalsTriangle;
        
    }
}

// Time o(n) rows
// Space o(1) as the output does not count towards space