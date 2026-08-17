class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int[] freq = new int[256];

        int left = 0;
        int right = 0;
        int maxLength = 0;

        while(right < s.length()){

            while(freq[s.charAt(right)] == 1){
                freq[s.charAt(left)] = 0;
                left++;
            }
            freq[s.charAt(right)] = 1;
            maxLength = Math.max(maxLength, right- left + 1);
            right++;
        }
        return maxLength;
    }
}
