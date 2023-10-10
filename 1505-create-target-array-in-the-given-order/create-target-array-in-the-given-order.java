class Solution {
  public int[] createTargetArray(int[] nums, int[] index) {
    List<Integer> reOrdered = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      reOrdered.add(index[i], nums[i]);
    }

    int[] output = new int[nums.length];

    for (int i = 0; i < reOrdered.size(); i++) {
      output[i] = reOrdered.get(i);
    }

    return output;

  }
}

// Time O(n2)
// Space O(n)