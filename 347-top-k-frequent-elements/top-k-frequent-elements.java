class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int num : nums) {
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<Integer, Integer> entry : seen.entrySet()) {
            maxHeap.add(entry);
        }

        int[] output = new int[k];

        for (int i = 0; i < output.length; i++) {
            output[i] = maxHeap.poll().getKey();
        }

        return output;
    }
}

// Time O(n log(n))
// Space O(n)