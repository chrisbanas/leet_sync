class Solution {
  public int timeRequiredToBuy(int[] tickets, int k) {

    int output = 0;

    for (int i = 0; i < tickets.length; i++) {
      if (i <= k) {
        output += Math.min(tickets[k], tickets[i]);
      } else {
        output += Math.min(tickets[k] - 1, tickets[i]);
      }
    }

    return output;

  }
}

// Time O(tickets.length) -> O(n)
// SpaceO(1)