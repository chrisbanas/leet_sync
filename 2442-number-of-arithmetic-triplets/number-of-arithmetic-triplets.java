class Solution {
     public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            seen.add(num);
        }

        int i = 0;
        int k = 1;
        int triplets = 0;

        while (k < nums.length) {
            if ((nums[k] - nums[i] == 2 * diff) && (seen.contains(diff + nums[i]))) {
                triplets++;
            }

            if (nums[k] - nums[i] < 2 * diff) {
                k++;
            } else {
                i++;
            }
        }

        return triplets;
    }
}

// Time O(nums.length) -> O(n)
// Space O(nums.length) -> O(n)