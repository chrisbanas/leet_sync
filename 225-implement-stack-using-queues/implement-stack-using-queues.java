  class MyStack {

    private ArrayList<Integer> stack;
    private int size;

    public MyStack() {
       stack = new ArrayList<>();
       size = -1;
    }

    public void push(int x) {
      stack.add(x);
      size++;
    }

    public int pop() {
      return stack.remove(size--);
    }

    public int top() {
      return stack.get(size);
    }

    public boolean empty() {
      return size == -1;
    }
  }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */