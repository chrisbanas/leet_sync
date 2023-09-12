class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> output = new ArrayList<>();

        int carry = 0;
        int i = num.length - 1;
        int tempSum = 0;

        while (i >= 0 || k > 0 || carry > 0) {

            if (i < 0) {
                tempSum = carry + k % 10;
            } else {
                tempSum = num[i] + carry + k % 10;
            }

            if (tempSum > 9) {
                output.add(0, tempSum % 10);
                carry = 1;
            } else {
                output.add(0, tempSum);
                carry = 0;
            }

            i--;
            k /= 10;
            tempSum = 0;

        }

        return output;
    }
}

// Time is O(n) as we iterate over each element of the num array
// Space O(n) as we create an Array list of the length of num and in some cases add one more additional value