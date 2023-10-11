class Solution {
  public boolean backspaceCompare(String s, String t) {
    Stack<Character> stackS = new Stack<>();
    Stack<Character> stackT = new Stack<>();

    for (char c : s.toCharArray()) {
      stackS.push(c);
    }

    for (char c : t.toCharArray()) {
      stackT.push(c);
    }

    StringBuilder newS = new StringBuilder();
    int sBackSpace = 0;


    StringBuilder newT = new StringBuilder();
    int tBackSpace = 0;

    while(!stackS.isEmpty()) {
      if (stackS.peek() == '#') {
        sBackSpace++;
        stackS.pop();
      } else {
        if (sBackSpace > 0) {
          stackS.pop();
          sBackSpace--;
        } else {
          newS.insert(0, stackS.pop());
        }
      }
    }

    while(!stackT.isEmpty()) {
      if (stackT.peek() == '#') {
        tBackSpace++;
        stackT.pop();
      } else {
        if (tBackSpace > 0) {
          stackT.pop();
          tBackSpace--;
        } else {
          newT.insert(0, stackT.pop());
        }
      }
    }

    return newS.toString().equals(newT.toString());

  }
}