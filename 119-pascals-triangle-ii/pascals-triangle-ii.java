class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(new ArrayList<Integer>(Arrays.asList(1)));
        triangle.add(new ArrayList<Integer>(Arrays.asList(1,1)));

        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> previousRow = triangle.get(i - 1);

            ArrayList<Integer> newRow = new ArrayList<>();
            newRow.add(1);

            for (int j = 1; j < previousRow.size(); j++) {
                newRow.add(previousRow.get(j - 1) + previousRow.get(j));
            }

            newRow.add(1);

            triangle.add(newRow);
        }

        return triangle.get(rowIndex);
        
    }
}