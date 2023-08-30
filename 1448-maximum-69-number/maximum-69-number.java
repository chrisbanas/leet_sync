// Just change the first six to a 9

class Solution {
    public int maximum69Number (int num) {
        
        List<Integer> digits = new ArrayList<>();

        while (num > 10) {
            digits.add(num % 10);
            num /= 10;
        }

        digits.add(num);

        int length = digits.size() - 1;

        int newNum = digits.get(length) == 6 ? 9 : 9;
        int replace = digits.get(length) == 6 ? 1 : 0;

        for (int i = length - 1; i >= 0; i--) {
            newNum *= 10;
            if (digits.get(i) == 6 && replace == 0) {
                newNum += 9;
                replace++;
            } else {
                newNum += digits.get(i);
            }

            
        }

        return newNum;




    }
}