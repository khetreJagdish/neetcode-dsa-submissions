class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int j = 0;

        while(j < Math.min(first.length(),last.length())){

            if(first.charAt(j) != last.charAt(j)){
                break;
            }
            j++;
        }
        return last.substring(0,j);
    }
}