class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLength = 0;

        for(int i = 0; i<s.length(); i++){

            boolean[] hash = new boolean[256];

            for(int j = i; j<s.length(); j++){

                if(hash[s.charAt(j)] == true) break;

                hash[s.charAt(j)] = true;
                maxLength = Math.max(maxLength,j-i+1);
            }
            
        }
    return maxLength;
    }
}
