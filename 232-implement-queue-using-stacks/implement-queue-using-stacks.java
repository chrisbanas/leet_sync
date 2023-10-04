  class MyQueue {

    private Deque<Integer> in;
    private Deque<Integer> out;

    public MyQueue() {
      this.in = new LinkedList<>();
      this.out = new LinkedList<>();
    }

    public void push(int x) {
      in.offerFirst(x);
    }

    public int pop() {
      this.slinky();
      return out.pollFirst();
    }

    public int peek() {
      this.slinky();
      return out.peekFirst();
    }

    public boolean empty() {
      return in.size() == 0 && out.size() == 0;
    }

    private void slinky() {
      if (out.isEmpty()) {
        while(!in.isEmpty()) {
          out.offerFirst(in.pollFirst());
        }
      }
    }

  }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */