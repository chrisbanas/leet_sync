class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double output = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            output = Math.max(output, sum);
        }

        return output / k;
    }
}

// Time O(nums.length) -> O(n)
// Space O(1)