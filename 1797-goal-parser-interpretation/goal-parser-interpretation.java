class Solution {
    public String interpret(String command) {
        
        char[] letters = command.toCharArray();
        StringBuilder parsedCommand = new StringBuilder();

        int i = 0;

        while (i < letters.length) {
             if (letters[i] == 'G') {
                parsedCommand.append("G");
                i++;
            } else if (letters[i] == '(' && letters[i + 1] == ')') {
                parsedCommand.append("o");
                i += 2;
            } else {
                parsedCommand.append("al");
                i += 4;
            }
        }

        return parsedCommand.toString();
        
    }
}

// Time O(log(n)) as on some iterations we are adding more than 1 to i
// Space O(n) as we need to build a char array of length command