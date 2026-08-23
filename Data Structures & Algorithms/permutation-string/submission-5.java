class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int[] s1Freq = new int[26];
        for(Character ch : s1.toCharArray()){
            s1Freq[ch - 'a']++;
        }

        int left = 0;
        int right = 0;
        int[] s2Freq = new int[26];

        while(right < s2.length()){

            s2Freq[s2.charAt(right) - 'a']++;

            while((right - left + 1) > s1.length()){
                s2Freq[s2.charAt(left) - 'a']--;
                left++;
            }

            if(Arrays.equals(s1Freq,s2Freq)){
                return true;
            }
            right++;
        }
    return false;
    }
}
