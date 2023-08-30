// The way we increment is on if it is shorter to go counterclockwise then clockwise
// if the pointer is not on the letter then we type and add to the type counter.

class Solution {
    public int minTimeToType(String word) {

        String alpha = "abcdefghijklmnopqrstuvwxyz";

        int time = 0;

        int pointer = 0;

        char[] letters = word.toCharArray();

        for (char letter : letters) {
            char current = alpha.charAt(pointer);
            if (current != letter) {
                int clockwise= Math.abs(alpha.indexOf(current) - alpha.indexOf(letter));
                int counterClockwise = Math.abs(26 - clockwise);

                // the + 1 accounts for the resetting of pointer below
                if (clockwise <= counterClockwise) {
                    time += clockwise + 1;
                } else {
                    time += counterClockwise + 1;
                }

                pointer = alpha.indexOf(letter);

            } else {
                time++;
            }
        }

        return time;


        
    }
}