class Solution {
    public int countPoints(String rings) {
        Set<Integer> red = new HashSet<>();
        Set<Integer> green = new HashSet<>();
        Set<Integer> blue = new HashSet<>();

        for (int i = 0; i < rings.length(); i += 2) {
            int currentRod = Character.getNumericValue(rings.charAt(i + 1));

            if (rings.charAt(i) == 'R') {
                red.add(currentRod);
            }
            if (rings.charAt(i) == 'G') {
                green.add(currentRod);
            }
            if (rings.charAt(i) == 'B') {
                blue.add(currentRod);
            }
        }

        int output = 0;

        for (int i = 0; i <= 9; i ++) {
            if (red.contains(i) && green.contains(i) && blue.contains(i)) {
                output++;
            }
        }

        return output;
    }
}