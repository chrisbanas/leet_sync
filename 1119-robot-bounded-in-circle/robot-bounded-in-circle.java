/*

We need to track our current position the next position must go either clockwise or counterslockwise and we need to end at (0, 0)

index 1 is east and west, index two is north and south. North is positive, south is negative
east is positive, west is negative

*/

// THIS IS AN IMPROVED SOLUTION AFTER LOOKING AT THE EDITORIAL

class Solution {
    public boolean isRobotBounded(String instructions) {
        int[][] direction = new int[][]{{0, 1}, {1, 0}, {0 , -1}, {-1, 0}};
        int currentDirection = 0;
        int[] position = new int[]{0, 0};

        for (char instruction : instructions.toCharArray()) {
            if (instruction == 'L') {
                currentDirection = (currentDirection + 3) % 4;
            }

            if (instruction == 'R') {
                currentDirection = (currentDirection + 1) % 4;
            }

            if (instruction == 'G') {
                position[0] += direction[currentDirection][0];
                position[1] += direction[currentDirection][1];
            }
        }

        return (position[0] == 0 && position[1] == 0) || currentDirection != 0;
    }
}

// Time O(n)
// Space O(1)