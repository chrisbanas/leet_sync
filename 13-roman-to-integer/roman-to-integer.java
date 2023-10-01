class Solution {
    public int romanToInt(String s) {

        Map<Character, Integer> key = new HashMap<>();

        key.put('I', 1);
        key.put('V', 5);
        key.put('X', 10);
        key.put('L', 50);
        key.put('C', 100);
        key.put('D', 500);
        key.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = key.get(s.charAt(i));
            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }
            prevValue = value;
        }

        return total;

        
    }
}