/*

This problem has very annoying test cases as you need to modify the orginal input, but it does not care about the rest of the characters after the modified part.

*/

class Solution {
    public int compress(char[] chars) {

        if (chars.length == 0) {
            return 0;
        } else if (chars.length == 1) {
            return 1;
        }

        List<Character> compressed = new ArrayList<>();

        int count = 1;
        char prev = chars[0];

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == prev) {
                count++;
                prev = chars[i];
            } else {
                compressed.add(prev);
                prev = chars[i];

                String amount = String.valueOf(count);

                for (char num : amount.toCharArray()) { // this a constant so time is still O(n)
                    if (count == 1) {
                        break;
                    } else {
                        compressed.add(num);
                    }
                    
                }

                count = 1;
            }
        }

        // Final add to the compressed list as the loop exits before it can add the last letter
        compressed.add(prev);
        String amount = String.valueOf(count);

        for (char num : amount.toCharArray()) {
            if (count == 1) {
                break;
            } else {
                compressed.add(num);
            }
        }

        // This modifies the orginal input and we don't care about the characters after the reduced length
        for (int i = 0; i < compressed.size(); i++) {
            chars[i] = compressed.get(i);
        }
        
        return compressed.size();
    }
}

// Time O(n)
// Space O(n)