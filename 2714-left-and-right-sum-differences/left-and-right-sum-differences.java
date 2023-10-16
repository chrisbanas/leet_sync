class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] pairSum = new int[nums.length];

        int left = 0;
        int right  = 0;

        for (int i = 1; i < nums.length; i++) {
            left += nums[i - 1];
            leftSum[i] = left;
        }

        for (int i = nums.length - 2; i > -1; i--) {
            right += nums[i + 1];
            rightSum[i] = right;
        }

        for (int i = 0; i < nums.length; i++) {
            pairSum[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return pairSum;

    }
}