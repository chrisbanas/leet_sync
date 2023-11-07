class Solution {
    public String getPermutation(int n, int k) {
        int[] factorial = new int[n];
        List<Integer> numbers = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        // create an array of factorial lookup
        factorial[0] = 1; // 0! = 1
        for(int i = 1; i < n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        // create a list of numbers to get indices
        for(int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        // decrement k to convert it to zero-based index
        k--;

        // find the k-th permutation by constructing the sequence from the n numbers
        for(int i = 1; i <= n; i++) {
            int index = k / factorial[n - i];
            sb.append(String.valueOf(numbers.get(index)));
            numbers.remove(index);
            k -= index * factorial[n - i];
        }

        return sb.toString();
    }
}

// Time O(n2)
// Space O(n)