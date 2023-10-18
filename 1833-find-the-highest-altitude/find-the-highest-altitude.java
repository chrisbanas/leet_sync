class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;

        int currentAlt = 0;

        for (int alt : gain) {
            currentAlt += alt;
            if (currentAlt > max) {
                max = currentAlt;
            }
        }

        return max;
    }
}

// Time O(gain.length) -> O(n)
// Space O(1)