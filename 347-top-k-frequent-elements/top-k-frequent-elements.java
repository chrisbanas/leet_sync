class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) {
            return nums;
        }

        Map<Integer, Integer> seen = new HashMap<>();

        for (int num : nums) {
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];

        for (int key : seen.keySet()) {
            int frequency = seen.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        int[] output = new int[k];
        int count = 0;

        for (int i = bucket.length - 1; i > 0 && count < k; i--) {
            if (bucket[i] != null) {
                for(Integer j : bucket[i]) {
                    output[count] = j;
                    count++;
                }
            }
        }

        return output;
    }
}

// Time O(n)
// Space O(n)