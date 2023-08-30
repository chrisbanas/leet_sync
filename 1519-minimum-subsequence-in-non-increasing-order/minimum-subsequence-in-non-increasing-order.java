// First we need the sum of the array;
// The we find the largest value and remove it from the sum the second and so on untill it is greater than the remaining sum
// We can sort the array to spead this up

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        Arrays.sort(nums);

        List<Integer> subsequence = new ArrayList<>();

        int currentSum = 0;

        for(int i = nums.length - 1; i >= 0; i--) {
            if (currentSum <= sum) {
                currentSum += nums[i];
                sum -= nums[i];
                subsequence.add(nums[i]);
            } else {
                break;
            }
        }

        return subsequence;

    }
}