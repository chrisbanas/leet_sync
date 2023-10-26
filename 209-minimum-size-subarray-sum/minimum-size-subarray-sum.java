class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int output = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                output = Math.min(output, i + 1 - left);
                sum -= nums[left++];
            }
        }

        return output != Integer.MAX_VALUE ? output : 0;
    }
}

// Time O(nums.length) -> O(n)
// Space O(1)