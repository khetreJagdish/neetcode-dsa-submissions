class Solution {
    public String longestCommonPrefix(String[] strs) {

        // step 1: just take first string as reference string to compare 
        // with   each string , because common prefix should be available 
        //in every string so whatever common prefix we have in first string
        // that should be available in every string of array

        String prefix = strs[0];
        // Step 2 : now Iterate through all further strings starting from 1 (skipping 0th string)

        for(int i = 1; i<strs.length; i++){

            // Step 3 : define j for comparing character between 2 strings
            int j = 0;

            // Step 4: j can be kess than min of between 2 string's length (bexause we only want common characters)
            while(j < Math.min(prefix.length(),strs[i].length())){

                if(prefix.charAt(j) != strs[i].charAt(j)){
                    break;
                }
                j++;
            }
            prefix = prefix.substring(0,j);
        }
    return prefix;
    }
}