class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        List<Integer> fibSeq = new ArrayList<>(Arrays.asList(0, 1));

        int i = 1;
        while (i < n) {
            fibSeq.add(fibSeq.get(i) + fibSeq.get(i - 1));
            i++;
        }

        return fibSeq.get(n);

    }
}