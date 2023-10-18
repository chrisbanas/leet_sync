class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        int rightSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int pivotSum = sum - nums[i] - rightSum;
            if (pivotSum == rightSum) {
                return i;
            }
            rightSum += nums[i];
        }

        return -1;

    }
}

// Time O(nums.length) -> O(n)
// Space O(1)