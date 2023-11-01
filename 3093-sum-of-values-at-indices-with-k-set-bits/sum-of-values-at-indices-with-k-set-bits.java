class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int temp=0;
        for(int i=0; i<nums.size(); i++)
        {
            if(Integer.bitCount(i)==k)
                temp+=nums.get(i);
            
        }
        return temp;
    }
}

// Time O(n)
// Space O(1)