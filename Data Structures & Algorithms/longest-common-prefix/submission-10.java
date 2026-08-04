class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        String firstString = strs[0];
        String lastString = strs[strs.length-1];

        int j = 0;
        
        while(j < Math.min(firstString.length(),lastString.length())){

            if(firstString.charAt(j) != lastString.charAt(j)){
                break;
            }
            j++;
        }
        firstString = firstString.substring(0,j);
        return firstString;
    }
    
}