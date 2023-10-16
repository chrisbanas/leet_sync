class Solution {
    public boolean isPalindrome(int x) {
        String converted = Integer.toString(x);

        int i = 0;
        int j = converted.length() - 1;

        while (i < j) {
            if (converted.charAt(i++) != converted.charAt(j--)) {
                return false;
            }
        }

        return true;
    }
}