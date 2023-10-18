class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int num : arr) {
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }

        Set<Integer> count = new HashSet<>();

        for (Map.Entry<Integer, Integer> pair : seen.entrySet()) {
            if (count.contains(pair.getValue())) {
                return false;
            } else {
                count.add(pair.getValue());
            }
        }

        return true;
    }
}

    // Time O(arr.length()) -> O(n)
    // Space O(arr.length()) -> O(n)