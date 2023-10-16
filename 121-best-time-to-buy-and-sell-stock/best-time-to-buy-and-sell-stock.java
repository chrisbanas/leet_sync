// [1,2]

class Solution {
    public int maxProfit(int[] prices) {

        int currentProfit = 0;
        int stockHolding = prices[0];  

        for (int i = 1; i < prices.length; i++) {
            if (stockHolding > prices[i]) { 
                stockHolding = prices[i]; 
            } else {
                if (prices[i] - stockHolding > currentProfit) {
                    currentProfit = prices[i] - stockHolding;
                }
            }
        }

        return currentProfit;
    }
}