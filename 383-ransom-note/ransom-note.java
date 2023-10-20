class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int a[] = new int[26];
        
        for(int i=0;i<magazine.length();i++){
            a[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(--a[ransomNote.charAt(i)-'a']<0)
                return false;
        }
        return true;
    }
}

// Time O(ransomNote.length() + magazine.length()) -> O(m + n)
// Space O(1) as there are only 26 letters in the alphabet and we know that all letters are lowercase