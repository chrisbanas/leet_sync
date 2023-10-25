class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (i >= k - 1) {
                min = Math.min(min, nums[i] - nums[i - (k - 1)]);
            }
        }

        return min;
    }
}