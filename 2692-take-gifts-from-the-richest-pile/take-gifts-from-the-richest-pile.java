class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < gifts.length; i++) {
            maxHeap.add(new int[]{gifts[i], i});
        }

        for (int i = k; i > 0 && !maxHeap.isEmpty(); i--) {
            int[] polled = maxHeap.poll();
            int remainder = (int) Math.sqrt(polled[0]);
            int index = polled[1];
            gifts[index] = remainder;
            maxHeap.add(new int[]{remainder, index});
        }

        long output = 0;

        for (int gift : gifts) {
            output += gift;
        }

        return output;
    }
}

// Time O(n log(n))
// Space O(gifts.length) -> O(n)