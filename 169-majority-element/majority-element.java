// To solve this in O(n) time and O(1) space, you need to use the Boyer-Moore Majority Voting Algorithm
// This algorithm will only work if the data is guaranteed to have a majority element that is greater than half the length of the input array.

class Solution {
  public int majorityElement(int[] nums) {
    int majority = 0;
    int count = 0;

    for (int num : nums) {
      if (count == 0) {
        majority = num;
        count++;
      } else if (num == majority) {
        count++;
      } else {
        count--;
      }
    }

    return majority;
  }
}

// Time O(nums.length) -> O(n)
// Space O(1)