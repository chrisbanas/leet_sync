class Solution {
    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);

        int minSum = 0;

        for (int i = 0; i < nums.length - 1; i += 2) {
            minSum += nums[i];
        }

        return minSum;
        
    }
}