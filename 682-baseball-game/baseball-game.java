class Solution {
  public int calPoints(String[] operations) {

    Stack<Integer> stack = new Stack<>();

    int score = 0;

    for (int i = 0; i < operations.length; i++) {
      if (operations[i].equals("+")) {
        int temp = stack.pop();
        int tempScore = stack.peek() + temp;
        score += tempScore;
        stack.push(temp);
        stack.push(tempScore);
      } else if (operations[i].equals("C")) {
        score -= stack.pop();
      } else if (operations[i].equals("D")) {
        score += stack.peek() * 2;
        stack.push(stack.peek() * 2);
      } else {
        int points = Integer.parseInt(operations[i]);
        score += points;
        stack.push(points);
      }
    }

    return score;
  }

}

// Time O(operations.length) -> O(n);
// Space O(operations.length) -> O(n);