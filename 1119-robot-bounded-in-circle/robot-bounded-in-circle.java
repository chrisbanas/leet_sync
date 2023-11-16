/*

We need to track our current position the next position must go either clockwise or counterslockwise and we need to end at (0, 0)

index 1 is east and west, index two is north and south. North is positive, south is negative
east is positive, west is negative

*/

class Solution {
    public boolean isRobotBounded(String instructions) {
        
        String[] direction = new String[]{"north", "east", "south", "west"};
        int currentDirection = 0;
        int[] position = new int[]{0,0};


        for (char instruction : instructions.toCharArray()) {
            if (instruction == 'G' && direction[currentDirection].equals("north")) {
                position[1]++;
            }

            if (instruction == 'G' && direction[currentDirection].equals("east")) {
                position[0]++;
            }

            if (instruction == 'G' && direction[currentDirection].equals("south")) {
                position[1]--;
            }

            if (instruction == 'G' && direction[currentDirection].equals("west")) {
                position[0]--;
            }

            if (instruction == 'L') {
                if (currentDirection == 0) {
                    currentDirection = direction.length - 1;
                } else {
                    currentDirection--;
                }
            }

            if (instruction == 'R') {
                if (currentDirection == 3) {
                    currentDirection = 0;
                } else {
                    currentDirection++;
                }
            }
        }

        return (position[0] == 0 && position[1] == 0) || currentDirection != 0;
    }
}

// Time O(n)
// Space O(1)