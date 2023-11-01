class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] output = new int[encoded.length + 1];
        output[0] = first;
        
        for (int i = 0; i < encoded.length; i++) {
           output[i + 1] = encoded[i] ^ output[i];
        }

        return output;
    }
}

// Time O(encoded.length) -> O(n)
// Space O(encoded.length + 1) -> O(n + 1)