class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        String first = strs[0];
        
        int i = 1;

        while(i < strs.length){

            int j = 0;
            while(j < Math.min(first.length(),strs[i].length())){

                if(first.charAt(j) != strs[i].charAt(j)){
                    break;
                }
                j++;
            }
            first = first.substring(0,j);
            i++;
        }
        return first;
    }
}