class Solution {
    public int maximizeSum(int[] nums, int k) {
        

        // Arrays.sort(nums, Collections.reverseOrder());

        // Arrays.sort(nums);

        // for (int i = nums.length - 1; k > 0; k--, i--) {
        //     score += nums[i] + 1;
        // }

        // return score;

        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        int score = 0;

        while (k > 0) {
            score += max;
            max++;
            k--;
        }

        return score;
        
    }
}