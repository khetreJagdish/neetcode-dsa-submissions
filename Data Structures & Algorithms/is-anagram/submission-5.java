class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int i = 0;
        char[] sArray = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tChar);

        while(i < s.length() && i< t.length()){
            if(sArray[i] != tChar[i]){
                return false;
            }
            i++;
        }
    return true;
    }
}
