class Solution {
    public int characterReplacement(String s, int k) {
        
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int maxCharFreq = 0;
        int[] freq = new int[26];

        while(right < s.length()){

            freq[s.charAt(right) - 'A']++;
            maxCharFreq = Math.max(maxCharFreq, freq[s.charAt(right) - 'A']);

            // windowSize - maxCharFreq
            int replacements = (right - left + 1) - maxCharFreq;
            if(replacements > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength,right - left + 1);
            right++;
        }
    return maxLength;
    }
}
