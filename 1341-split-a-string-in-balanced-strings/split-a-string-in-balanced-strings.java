// As the substring is moving we keep track of the r & ls and at the end if they are the same number
// increase the count

// If the flag is R then the next leeter needs to be an R or an L

class Solution {
    public int balancedStringSplit(String s) {

        int count = 0;

        int tempR = 0;
        int tempL = 0;

        char previous = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == 'R') {
                tempR ++;
            } else {
                tempL++;
            }

            if (tempR == tempL) {
                count++;
                tempR = 0;
                tempL = 0;
            }

        }


        return count;
        
    }
}