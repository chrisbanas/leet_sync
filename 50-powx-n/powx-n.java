class Solution {
    public double myPow(double x, int n) {
        if (x == 0) return 0;
        if (n == 0) return 1;

        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double answer = 1;
        double current_product = x;
        for (long i = N; i > 0; i /= 2) {
            if (i % 2 == 1) {
                answer = answer * current_product;
            }
            current_product = current_product * current_product;
        }

        return answer;
    }
}

// Time O(log(n))
// Space O(1)