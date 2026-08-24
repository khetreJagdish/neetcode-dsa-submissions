class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String first = strs[0];
        
        for(int i = 1; i<strs.length; i++){

            int index = 0;
            
            while(index < Math.min(first.length(),strs[i].length())){

                if(first.charAt(index) !=  strs[i].charAt(index)) {
                    break;
                }
                index++;
            }
            first = first.substring(0,index);
        }
    return first;
    }
}