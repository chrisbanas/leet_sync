class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> bank = new HashMap<>();

        char[] stonesList = stones.toCharArray();

        for (char stone : stonesList) {
            if (bank.containsKey(stone)) {
                bank.put(stone, bank.get(stone) + 1);
            } else {
                bank.put(stone, 1);
            }
        }

        char[] jewelsList = jewels.toCharArray();
        int count = 0;

        for (char jewel : jewelsList) {
            if (bank.containsKey(jewel)) {
                count += bank.get(jewel);
                bank.put(jewel, 0);
            }
        }

        return count;

    }

}

// Time O(n) whichever is longer jewles or stones becase we iterate over each list once
// Space O(n) becase we make the char arrays and hashmap