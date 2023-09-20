class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] output = new int[nums.length * 2];

        int j = 0;

    for (int i = 0; i < nums.length; i++) {
      output[i] = nums[i];
      output[i + nums.length] = nums[i];
    }

    return output;
    }
}