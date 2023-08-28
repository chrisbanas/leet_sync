class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        // You have to add one here because of 0 indexing you will be one short
        int[] fibSeq = new int[n + 1]; 
        fibSeq[0] = 0;
        fibSeq[1] = 1;

        for (int i = 2; i <= n; i++) {
            int nextNum = fibSeq[i - 1] + fibSeq[i - 2];
            fibSeq[i] = nextNum;
        }

        return fibSeq[n];

    }
}