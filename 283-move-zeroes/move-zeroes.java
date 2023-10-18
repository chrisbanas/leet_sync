class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;

        // This part moves only non zero numbers up
        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }

        // This part sets everything after non zeros to zero
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }

    }
}

// Time O(nums.length) -> O(n)
// Space O(1)