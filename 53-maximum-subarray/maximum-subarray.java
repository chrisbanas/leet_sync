class Solution {
    public int maxSubArray(int[] nums) {
        int currentSub = nums[0];
        int maxSub = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            currentSub = Math.max(num, currentSub + num);
            maxSub = Math.max(maxSub, currentSub);
        }

        return maxSub;
        
    }
}