class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        String first = strs[0];
        
        int i = 1;

        while(i < strs.length){ // if N = length of String array then it runs max up to (N-1) times

            int j = 0;
            while(j < Math.min(first.length(),strs[i].length())){ //  max we are comapring till min length of String

                if(first.charAt(j) == strs[i].charAt(j)){
                    j++;
                }else{
                    break;
                }
                
            }
            first = first.substring(0,j); 
            i++;
        }
        return first;
    }
}