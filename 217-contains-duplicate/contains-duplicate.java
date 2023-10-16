class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> dupsLookup = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (dupsLookup.containsKey(nums[i])) {
                return true;
            } else {
                dupsLookup.put(nums[i], 1);
            }
        }

        return false;
    }
}