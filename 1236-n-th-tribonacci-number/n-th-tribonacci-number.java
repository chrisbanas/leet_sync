class Solution {
    public int tribonacci(int n) {
        
        if (n == 0) {
            return 0;
        }
        
        if (n <= 2) {
            return 1;
        }

        int twoBack = 0;
        int oneBack = 1;
        int current = 1;

        for (int i = 2; i < n; i++) {
            int tempCurrentSum = twoBack + oneBack + current;
            int temp = current;

            current = tempCurrentSum;
            twoBack = oneBack;
            oneBack = temp;

        }

        return current;


    }
}