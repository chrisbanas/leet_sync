class Solution {
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Stack<Integer> stack = new Stack<>();
    HashMap<Integer, Integer> seen = new HashMap<>();

    for (int i = 0; i < nums2.length; i++) {
      while (!stack.isEmpty() && nums2[i] > stack.peek()) {
        seen.put(stack.pop(), nums2[i]);
      }
      stack.push(nums2[i]); // Push the current element onto the stack
    }

    // Handle remaining elements in the stack
    while (!stack.isEmpty()) {
      seen.put(stack.pop(), -1);
    }

    int[] output = new int[nums1.length];

    for (int i = 0; i < nums1.length; i++) {
      output[i] = seen.get(nums1[i]);
    }

    return output;

  }
}