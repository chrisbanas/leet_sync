class Solution {
  public int[] sortArray(int[] nums) {
    mergeSort(nums, 0, nums.length-1);
    return nums;
  }

  public void mergeSort(int[] nums, int low, int high){
    if(low>=high){
      return;
    }

    int start = low;
    int end = high;
    int mid = start+(end-start)/2;
    int pivot = nums[mid];

    while(start <= end){
      while(nums[start] < pivot){
        start++;
      }
      while(nums[end] > pivot){
        end--;
      }
      if( start <= end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
      }
    }
    mergeSort(nums, low , end);
    mergeSort(nums, start , high);
  }
}