class Solution {
    public String removeTrailingZeros(String num) {
        int endIndex = num.length();

        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) != '0') {
                break;
            } else {
                endIndex = i;
            }
        }

        return num.substring(0, endIndex);
    }
}