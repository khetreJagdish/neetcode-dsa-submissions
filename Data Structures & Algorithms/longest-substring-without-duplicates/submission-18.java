class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("") || s.length() == 0) return 0;
        int maxLength = Integer.MIN_VALUE;

        int[] freq = new int[256];
        int i = 0;
        for(int j =0; j<s.length(); j++){

            while(freq[s.charAt(j)] == 1){
                freq[s.charAt(i)]--;
                i++;
            }
            freq[s.charAt(j)] = 1;
            maxLength = Math.max(maxLength,j-i+1);
        }
    return maxLength;
    }
}
