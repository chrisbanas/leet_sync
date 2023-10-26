class Solution {
    public String longestPalindrome(String s) {
        int max_len=Integer.MIN_VALUE;
        String ans="";
        for(int i=0;i<s.length();i++){
            int left=i,right=i;
            //odd length
            while(left>=0 && right <s.length() && s.charAt(left)==s.charAt(right)){
                if(right-left+1>max_len){
                    max_len=right-left+1;
                    ans=s.substring(left,right+1);
                }
                left--;
                right++;
            }
            //even length
            left=i;
            right=i+1;
            while(left>=0 && right <s.length() && s.charAt(left)==s.charAt(right)){
                if(right-left+1>max_len){
                    max_len=right-left+1;
                    ans=s.substring(left,right+1);
                }
                left--;
                right++;
            }

        }
        return ans;
        
    }
}