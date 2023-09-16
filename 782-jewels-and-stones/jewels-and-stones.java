class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelType = new HashSet<>();
        int output = 0;

        for (int i = 0; i < jewels.length(); i++) {
            jewelType.add(jewels.charAt(i));
        }

        for (int i = 0; i < stones.length(); i++) {
            if (jewelType.contains(stones.charAt(i))) {
                output++;
            }
        }

        return output;
    }
}