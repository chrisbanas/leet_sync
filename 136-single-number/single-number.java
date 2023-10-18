class Solution {
    public int singleNumber(int[] nums) {

        int output = 0;

        for (int num : nums) {
            output ^= num;
        }
        
        return output;
        
    }
}

// Time O(nums.length) -> O(n)
// Space O(1)