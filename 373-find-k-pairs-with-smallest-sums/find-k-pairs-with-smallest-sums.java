class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        if (nums1.length == 0 || nums2.length == 0 || k == 0) {
            return new ArrayList<>();
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(pair -> (nums1[pair[0]] + nums2[pair[1]])));

        // Only need to consider the first k elements in nums1 since we're finding the k smallest pairs
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            minHeap.offer(new int[] {i, 0});
        }

        List<List<Integer>> output = new ArrayList<>();

        while (k-- > 0 && !minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            output.add(Arrays.asList(nums1[current[0]], nums2[current[1]]));

            if (current[1] < nums2.length - 1) {
                minHeap.offer(new int[] {current[0], current[1] + 1});
            }
        }

        return output;
    }
}