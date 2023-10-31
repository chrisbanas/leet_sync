class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            if (num != 0) {
                pq.add(num);
            }
        }

        int count = 0;

        while (!pq.isEmpty()) {
            int current = pq.poll();

            while (!pq.isEmpty() && pq.peek() == current) {
                pq.poll();
            }

            count++;
        }

        return count;
    }
}

// Time O(n log(n)) -> to create a pq and loop over each element of the array and add them that is an O n log(n) operation O(log(n)) for the queue insertion and O(n) for the for loop.
// Space O(nums.length) -> O(n)