class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (k > nums.length || k < 0) {
            return 0;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int num : nums) {
            maxHeap.add(num);
        }

        for (int i = 1; i < k; i++) {
            maxHeap.poll();
        }

        return maxHeap.peek();
    }
}