// All this problem cares about is returning the unique numbers that show up in each array.

class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> seen1 = new HashSet<>();
    Set<Integer> seen2 = new HashSet<>();

    for (int num : nums1) {
      seen1.add(num);
    }

    for (int num : nums2) {
      if (seen1.contains(num)) {
        seen2.add(num);
      }
    }

    int[] output = new int[seen2.size()];
    int i = 0;

    for (int num : seen2) {
      output[i++] = num;
    }

    return output;

  }
}

// Space & Time are O(n + m)