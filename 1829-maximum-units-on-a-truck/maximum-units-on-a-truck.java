// You want to prioritize the boxes with the most units first and then work down.

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        // This uses a lambda to sort the internal arrays where the largest second value array will come first
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int maxUnits = 0;
        int i = 0;

        while (truckSize > 0 && i < boxTypes.length) {
            if (boxTypes[i][0] <= truckSize) {
                maxUnits += boxTypes[i][0] * boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            } else {
                maxUnits += truckSize * boxTypes[i][1];
                truckSize = 0;
            }
            i++;
        }

        return maxUnits;
    }
}

// Time o(nlogn) - due to using sort
// Space o(1)