// I would keep iterating multiplying i by iteself until we hit a number that i greater than x. When we do we just return i - 1. Also if i times itself == x then we return i.

class Solution {
    public int mySqrt(int x) {

    int left = 1; // mid always >= 1;
    int right = x;
    int answer = 0; // skip loop when right is 0
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (mid <= x / mid) {
            left = mid + 1;
            answer = mid;
        } else
            right = mid - 1;
    }
    return answer;
        
    }
}