class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        char trigger = 'x';

        int j = 0;
        int k = n;

        for (int i = 0; i < nums.length; i++) {
            if (trigger == 'x') {
                ans[i] = nums[j];
                j++;
                trigger = 'y';
            } else if (trigger == 'y') {
                ans[i] = nums[k];
                trigger = 'x';
                k++;
            }
        }

        return ans;
        
    }
}