class Solution {
  public int splitArray(int[] nums, int k) {
    int low = 0;
    int high = 0;
    for (int num : nums) {
      low = Math.max(low, num);
      high += num;
    }

    while (low < high) {
      int mid = low + (high - low) / 2;
      if (possible(nums, k, mid)) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }

    return low;
  }

  public boolean possible(int[] nums, int k, int guess) {
    int count = 1;
    int sum = 0;

    for (int num : nums) {
      sum += num;
      if (sum > guess) {
        sum = num;
        count++;
      }
      if (count > k) {
        return false;
      }
    }

    return true;
  }
}