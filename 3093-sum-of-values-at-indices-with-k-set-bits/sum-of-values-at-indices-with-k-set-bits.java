class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int output = 0;

        for (int i = 0; i < nums.size(); i++) {
            String binaryString = Integer.toBinaryString(i);
            int onesCount = 0;

            for (int j = 0; j < binaryString.length(); j++) {
                if (binaryString.charAt(j) == '1') {
                    onesCount++;
                }
            }

            if (onesCount == k) {
                output += nums.get(i);
            }
        }

        return output;
    }
}

// Time O(n log(n)) -> as the second loop is log2(n) or log(n)
// Space O(1)