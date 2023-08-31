class Solution {
    public int splitNum(int num) {

        // Handle edge cases (not necessary)
        // if (num < 100) {
        //     return (num % 10) + (num / 10);
        // }

        // Get all the digits
        List<Integer> digits = new ArrayList<>();

        while (num >= 10) { // this needed to be >= which was causing the fail
            digits.add(num % 10);
            num /= 10;
        }

        // Grabs the remaining digit
        digits.add(num);

        // Sort in acending order
        Collections.sort(digits);

        int num1 = digits.get(0);
        int num2 = digits.get(1);

        // build num1
        for (int i = 2; i < digits.size(); i += 2 ) {
            if (digits.get(i) != 0) {
                num1 *= 10;
                num1 += digits.get(i);
            }

        }

        // build num2
        for (int i = 3; i < digits.size(); i += 2 ) {
            if (digits.get(i) != 0) {
                num2 *= 10;
                num2 += digits.get(i);
            }
        }

        return num1 + num2;
        
    }
}

// Time is O(nlog(n)) - because of the sort
// Space is O(1) because of the array list will never be larger than length 9