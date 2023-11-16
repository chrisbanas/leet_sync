/*
https://www.youtube.com/watch?v=tPr5Uae6Drc

On a move you can add x to y or y to x.

The best way to to take the tx and ty and work backwards towards sx and sy subtracting from the larger one. But this solution will time out. There is a trick using % where you take the % of each's  opposite but you will run into an issue where sometimes it returns 0 even though we can sucessfuly transform the numbers. In that case we just subtract sy from ty or sx from tx and then see if it's % == 0 and if it does than we also know it is transformable.

*/

class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        if (sx > tx || sy > ty) {
            return false;
        }

        if (sx == tx && sy == ty) {
            return true;
        }

        while(tx >= sx && ty >= sy) {
            if (tx == ty) {
                break;
            }

            if (tx > ty) {
                if (ty > sy) {
                    tx %= ty;
                } else {
                    return (tx - sx) % ty == 0;
                }
            } else {
                if (tx > sx) {
                    ty %= tx;
                } else {
                    return (ty - sy) % tx == 0;
                }
            }
        }

        return (tx == sx && ty == sy);  
    }
}

// Time O(log(max(tx,ty))) -> O(log(n))
// Space O(1)