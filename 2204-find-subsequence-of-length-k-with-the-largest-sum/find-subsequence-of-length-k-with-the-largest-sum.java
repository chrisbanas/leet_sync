class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            entries.add(Map.entry(nums[i], i));
        }

        // Sort entries based on the values, descending
        entries.sort((a, b) -> b.getKey().compareTo(a.getKey()));

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue)
        );

        // Add the k largest elements to the minHeap
        for (int i = 0; i < k; i++) {
            minHeap.add(entries.get(i));
        }

        // Extract the elements from the minHeap to maintain the original order
        int[] output = new int[k];
        int i = 0;
        while (!minHeap.isEmpty()) {
            output[i++] = nums[minHeap.poll().getValue()];
        }

        return output;
    }
}

// Time O(n log(n)) -> sorting
// Space O(k)