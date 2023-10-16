/*

Two pointers one at each end and take the total between them. THe lower of the two * number of indexs bewtwen

If the left is lower then increase its index, if the right is lower decrease its index

keep track of a total volume

*/

class Solution {
    public int maxArea(int[] height) {
        int volume = 0;

        int i = 0;
        int j = height.length - 1;

        while (i < j) {

            int maxVolume = Math.min(height[i], height[j]); 

            int tempVolume = maxVolume * (j - i); 

            if (tempVolume > volume) {
                volume = tempVolume;
            }

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
            
        }

        return volume;

    }
}