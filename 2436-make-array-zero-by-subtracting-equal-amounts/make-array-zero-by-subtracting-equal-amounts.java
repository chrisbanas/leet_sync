// First we need a max and min from the array. Then every loop we subtrack the min number from everything untill we finally get all 0's. 



class Solution {
    public int minimumOperations(int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num != 0 && num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        
        int count = 0;
        boolean allZero = false;

        while (!allZero) {
            allZero = true;
            int tempMin = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[i] -= min;

                    if (nums[i] != 0 && nums[i] < tempMin) {
                        tempMin = nums[i];
                    }

                    allZero = false;
                }
            }

            count++;
            min = tempMin;

        }

        return count - 1;
    }
}