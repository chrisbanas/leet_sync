/*

Optimized using Manacher's algorithm

*/


class Solution {
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;

            // Transform the string to add boundaries (#) to handle even-length cases
            String transformed = "#" + s.chars().mapToObj(c -> (char) c + "#").collect(Collectors.joining());

            int[] p = new int[transformed.length()];
            int center = 0, right = 0, count = 0;

            for (int i = 1; i < transformed.length() - 1; i++) {
            int mirror = 2 * center - i; // Find the mirror of i

            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            // Expanding around the center
            while (i + 1 + p[i] < transformed.length() &&
                    i - 1 - p[i] >= 0 &&
                    transformed.charAt(i + 1 + p[i]) == transformed.charAt(i - 1 - p[i])) {
                p[i]++;
            }

            // Update the center and right boundary
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            // Add to count (considering half length)
            count += (p[i] + 1) / 2;
            }

            return count;
    }
}

// Time O(n)
// Space O(1)