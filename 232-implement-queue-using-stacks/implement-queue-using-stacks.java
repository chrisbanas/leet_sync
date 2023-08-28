class MyQueue {

    private Deque<Integer> stack;

    public MyQueue() {
        stack = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        stack.offer(x);
    }
    
    public int pop() {
        return stack.poll();
    }
    
    public int peek() {
        return stack.peek();
    }
    
    public boolean empty() {
        return stack.size() == 0;
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