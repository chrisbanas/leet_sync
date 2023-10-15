class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (seen.containsKey(nums[i]) && Math.abs(seen.get(nums[i]) - i) <= k) {
                return true;
            } else {
                seen.put(nums[i], i);
            }
        }

        return false;
    }
}

// Time O(nums.length) -> O(n)
// Space O(1)