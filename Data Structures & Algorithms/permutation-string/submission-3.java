class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int[] freq = new int[26];
        for(int i =0; i<s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
        }

        for(int i = 0; i<s2.length(); i++){

            int[] freq2 = new int[26];

            for(int j = i; j<s2.length(); j++){

                freq2[s2.charAt(j) - 'a']++;

                if(j - i +1 > s1.length()){
                    break;
                }

                if(Arrays.equals(freq,freq2)){
                    return true;
                }
            }
        }
    return false;
    }
}
