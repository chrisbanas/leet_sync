class Solution {
  public int findTheWinner(int n, int k) {
    Queue<Integer> circle = new LinkedList<>();

    for (int i = 1; i <= n; i++) {
      circle.add(i);
    }

    while(circle.size() > 1) {
      for (int i = 1; i <= k; i++) {
        if (i == k) {
          circle.poll();
        } else {
          int temp = circle.poll();
          circle.offer(temp);
        }
      }
    }

    return circle.peek();

  }
}

// Time O(n)
// Space O(n)