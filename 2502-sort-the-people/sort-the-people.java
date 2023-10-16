class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, Integer> heightIndex = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            heightIndex.put(heights[i], i);
        }

        Arrays.sort(heights);

        String[] output = new String[names.length];
        int j = 0;
        
        for (int i = heights.length - 1; i >= 0; i--) {
            output[j] = names[heightIndex.get(heights[i])];
            j++;
        }

        return output;
    }
}