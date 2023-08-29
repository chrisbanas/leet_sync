class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int oneStep = 0;
        int twoStep = 0;

        // Since we are calculating back indexes we need to add 1 to the array length to handel the top floor which would be conisdered out of bounds.

        for (int i = 2; i < cost.length + 1; i++) {
            int temp = oneStep;
            oneStep = Math.min(oneStep + cost[i - 1], twoStep + cost[i - 2]);
            twoStep = temp;
        }

        return oneStep;
    }
}