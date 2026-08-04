class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // step I : just take first string as reference string so that we can compare with each remaining string 
        String firstString = strs[0]; 

    // Step II : Start from 1st elemement and iterate over the array to check the max longest common prefix.

    for(int i = 1; i<strs.length; i++){

        int j = 0;

        while(j < Math.min(firstString.length(), strs[i].length())){
            if(firstString.charAt(j) != strs[i].charAt(j)){
                break;
            }
            j++;
        }
        firstString =firstString.substring(0,j);
    }
    return firstString;

    }
}