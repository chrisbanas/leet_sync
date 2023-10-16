class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> uniqueNums1 = new HashSet<>();

        for (int num : nums1) {
            uniqueNums1.add(num);
        }

        List<Integer> pairs = new ArrayList<>();

        for (int i = 0; i < nums2.length; i++) {
            if (uniqueNums1.contains(nums2[i])) {
                pairs.add(nums2[i]);
                uniqueNums1.remove(nums2[i]); // You have to remove it from the set otherwise you end up with duplicates in the result.
            }
        }

        int[] output = new int[pairs.size()];

        for (int i = 0; i < output.length; i++) {
            output[i] = pairs.get(i);
        }

         return output;

    }
}