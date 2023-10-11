/*
loop over the string tracking the number of '(' once we hit a ')' then we start to deduct from the count of '(' untill it reaches zero and we know that is the outer most.

*/ 

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder output = new StringBuilder();

        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(' && count != 0) {
                output.append(c);
                count++;
            } else if (c == ')' && count > 1){
                output.append(c);
                count--;
            } else if (c == '(' && count == 0) {
                count++;
            } else if (c ==')' && count == 1) {
                count--;
            }
        }

        return output.toString();

    }
}