class RecentCounter {

    Deque<Integer> queue;

    public RecentCounter() {
        this.queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        this.queue.offer(t);

        while (this.queue.peek() < t - 3000) {
            this.queue.poll();
        }

        return this.queue.size();
    }
}

// Time O(3000) -> O(1)
// Space O(3000) -> O(1)

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */