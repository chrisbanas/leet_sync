class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for (int num : nums) {
            elementSum += num;

            if (num < 10) {
                digitSum += num;
            } else {
                int temp = num;
                while (temp > 9) {
                    digitSum += temp % 10;
                    temp /= 10;
                }
                digitSum += temp;
            }
        }

        return Math.abs(elementSum - digitSum);
    }
}

// Time O(nums.length)
// Space O(1)