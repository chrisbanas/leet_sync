class MyStack {

    private Deque<Integer> queue;

    public MyStack() {
        queue = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        queue.offerFirst(x);
    }
    
    public int pop() {
        return queue.pollFirst();
    }
    
    public int top() {
        return queue.peekFirst();
    }
    
    public boolean empty() {
       return queue.size() == 0;
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