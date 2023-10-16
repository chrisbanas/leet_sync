class Solution {
    public int removeElement(int[] nums, int val) {
        int output = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                int temp = nums[output];
                nums[output++] = nums[i];
                nums[i] = temp;
            }
        }

        return output;
    }
}