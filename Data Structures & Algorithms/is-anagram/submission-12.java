class Solution {
    public boolean isAnagram(String s, String t) {

        int[] ans = new int[26];

        for(char ch  : s.toCharArray()){
            ans[ch - 'a']++;
        }

        for(char ch : t.toCharArray()){
            ans[ch - 'a']--;
        }

        for(int n : ans){
            if(n != 0){
                return false;
            }
        }
    return true;
    }
}
