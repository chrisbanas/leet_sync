import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> bank = new HashMap<>();
        
        int count = nums.length / 2;

        for (int num : nums) {
            if (bank.get(num) == null) {
                bank.put(num, 1);
            } else {
                bank.put(num, bank.get(num) + 1);
            }
            
            if (bank.get(num) > count) {
                return num;
            }

        }

        return -1;
    }
}