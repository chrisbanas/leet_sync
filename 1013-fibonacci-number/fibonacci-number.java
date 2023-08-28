class Solution {
    
    // Creating a hash map with 0 -> 0 and 1 -> 1 pairs
    private Map<Integer, Integer> cache = new HashMap<>(Map.of(0, 0, 1, 1));

    public int fib(int n) {
        // Since we preloaded the hashmap we don't need the base case from the regular recursion

        // If it has that key we have seen that part of the tree and can return its value
        // Otherwise put n in the cache with its value
        if (cache.containsKey(n)) {
            return cache.get(n);
        } else {
            cache.put(n, fib(n - 1) + fib(n - 2));
            return cache.get(n);
        }

        



    }

    
}