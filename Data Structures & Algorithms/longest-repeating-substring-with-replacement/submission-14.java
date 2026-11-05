class Solution {
    public int characterReplacement(String s, int k) {
        
        int maxLength = 0;
        int left = 0;
        int[] freq = new int[26];
        int maxCharCount = 0;
        for(int right = 0; right<s.length(); right++){

                freq[s.charAt(right)-'A']++;
                maxCharCount = Math.max(maxCharCount,freq[s.charAt(right)-'A']);

                while((right-left+1) - maxCharCount > k){
                    freq[s.charAt(left)-'A']--;
                    left++;
                }
                maxLength = Math.max(maxLength,right-left+1);
            }
            return maxLength;
        }
        
}