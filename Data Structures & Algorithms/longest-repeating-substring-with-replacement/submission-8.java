class Solution {
    public int characterReplacement(String s, int k) {
        
        int left = 0;
        int right = 0;
        int[] freq = new int[26];
        int maxLength = 0;
        int maxCharLength = 0;
        while(right < s.length()){

            freq[s.charAt(right) - 'A']++;
            maxCharLength = Math.max(maxCharLength, freq[s.charAt(right) - 'A']);
            int replacements = (right - left + 1) - maxCharLength;
            if(replacements > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
    return maxLength;
    }
}
