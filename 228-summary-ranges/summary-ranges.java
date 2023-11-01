class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> output = new ArrayList<>();

        if (nums.length == 0) {
            return output;
        }

        long start = nums[0];
        Long current = null;

        for (int i = 1; i <= nums.length; i++) {
            if ((i == nums.length) || (nums[i - 1] != nums[i] - 1) ) {
                if (current == null) {
                    output.add("" + start);
                } else {
                    output.add(start + "->" + current);
                    current = null;
                }
                if (i < nums.length) {
                    start = nums[i];
                }
            } else {
                current = (long) nums[i];
            }
        }

        return output;
    }
}

// Time O(nums.length) -> O(n)
// Space O(nums.length) -> O(n)