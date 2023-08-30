// This problem is worded tricky. They key is that is is free to move even chips to the same space and odd chips to the same space. So whichever even or odd has more chips will be the number of spaces it takes to move them all to the same space.

class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : position) {
           if (num % 2 == 0) {
               evenCount++;
           } else {
               oddCount++;
           }
        }

        return Math.min(oddCount, evenCount);
    }
}