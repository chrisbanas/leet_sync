class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> seen1 = new HashSet<>();
        Set<Integer> seen2 = new HashSet<>();

        for (int num : nums1) {
            seen1.add(num);
        }

        for (int num : nums2) {
            seen2.add(num);
        }

        List<List<Integer>> output = new ArrayList<>();
        List<Integer> unique1 = new ArrayList<>();
        List<Integer> unique2 = new ArrayList<>();

        for (int num : seen1) {
            if (!seen2.contains(num)) {
                unique1.add(num);
            }
        }

        for (int num : seen2) {
            if (!seen1.contains(num)) {
                unique2.add(num);
            }
        }

        output.add(unique1);
        output.add(unique2);

        return output;

    }
}

// Time O(nums1.length + nums2.length) - O(n1 + n2)
// Space O(nums1.length + nums2.length) - O(n1 + n2)