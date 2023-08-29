// It is all dependent on the first two numbers and what one we pick as each will have it's own path but we don't know if that path is going to be better.

class Solution {
    public int rob(int[] nums) {

        if (nums.length == 1) return nums[0];

        int[] rob = new int[nums.length];

        // Base cases
        rob[0] = nums[0];
        rob[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            rob[i] = Math.max(rob[i - 1], rob[i - 2] + nums[i]); // Recurrence relation
        }

        return rob[nums.length - 1];

    }
}