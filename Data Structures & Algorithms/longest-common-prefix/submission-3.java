class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        for(int i = 0; i<first.length; i++){
            if(first[i] != last[i]){
                return strs[0].substring(0,i);
            }
        }
        return new String(first);

    }
}