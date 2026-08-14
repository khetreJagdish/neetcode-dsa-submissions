class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int longestLength = 0;

        for(int i = 0; i<s.length(); i++){

            int[] freq = new int[256];

            for(int j = i; j<s.length(); j++){

                if(freq[s.charAt(j)] == 1){
                    break;
                }
                longestLength = Math.max(longestLength, j - i +1);
                freq[s.charAt(j)] = 1;
            }
        }
    return longestLength;
    }
}
