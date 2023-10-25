class Solution {
    public int divisorSubstrings(int num, int k) {
        String converted = String.valueOf(num);
        int output = 0;

        if (converted.length() < k) {
            return output;
        }

        for (int i = 0; i < converted.length(); i++) {
            if (i + k - 1 < converted.length()) {
                int parsed = Integer.parseInt(converted.substring(i, i + k));
                if (parsed != 0 && num % parsed == 0) {
                    output++;
                }
            }
        }

        return output;

    }
}