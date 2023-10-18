class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (n == 0) {
            return true;
        }

        if (flowerbed.length == 1 && flowerbed[0] == 0 && n <= 1) {
            return true;
        } else if (flowerbed.length == 2 && flowerbed[0] == 0 && flowerbed[1] == 0 && n <= 1) {
            return true;
        }

        boolean placeable = false;

        for (int i = 0; i < flowerbed.length; i++) {
            if (n == 0) {
                return true;
            }

            if (flowerbed[i] == 0) {
                placeable = true;
            } else {
                placeable = false;
            }

            if (placeable) {
                if (i == 0) {
                    if (flowerbed[i] == 0 && flowerbed[i + 1] == 0){
                        flowerbed[i] = 1;
                        n--;
                    }
                } else if (i == flowerbed.length - 1) {
                    if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    } 
                } else if (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }

        }

        return n == 0;
    }
}