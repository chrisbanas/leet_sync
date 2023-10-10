class Solution {
  public int[] finalPrices(int[] prices) {
    Deque<Integer> monotonicStack = new ArrayDeque<>();

    for (int i = 0; i < prices.length; i++) {
      while (!monotonicStack.isEmpty() && prices[i] <= prices[monotonicStack.peek()]) {
        prices[monotonicStack.pop()] -= prices[i];
      }
      monotonicStack.push(i);
    }

    return prices;

  }
}

  // Time O(prices.length) -> O(n)
  // Space O(prices.length) -> O(n)