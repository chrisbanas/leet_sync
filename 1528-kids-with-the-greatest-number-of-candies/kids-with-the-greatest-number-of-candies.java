class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = Integer.MIN_VALUE;

        for (int candie : candies) {
            if (candie > max) {
                max = candie;
            }
        }

        List<Boolean> greatest = new ArrayList<>();

        for (int candie : candies) {
            if (candie + extraCandies >= max) {
                greatest.add(true);
            } else {
                greatest.add(false);
            }
        }

        return greatest;
        
    }
}