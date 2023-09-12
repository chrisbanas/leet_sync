class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap bank = new HashMap();

        int[] output = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (bank.containsKey(temp)) {
                output[0] = (int) bank.get(temp);
                output[1] = i;
            } else {
                bank.put(nums[i], i);
            }
        }

        return output;
    }
}

// Time is O(n) as we loop through each value of the array
// Space is O(n) as we make a hash map of the same size as the array