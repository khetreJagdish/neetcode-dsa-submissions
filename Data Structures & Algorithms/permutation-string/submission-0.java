class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] s1Array = new int[26];
       for(int i =0; i<s1.length(); i++){
            s1Array[s1.charAt(i) - 'a']++;
       } 

       for(int i = 0; i<s2.length(); i++){
            int[] freq = new int[26];

            for(int j = i; j<s2.length(); j++){

                freq[s2.charAt(j) - 'a']++;
                if(Arrays.equals(s1Array, freq)){
                    return true;
                }
                if(s1Array.length > freq.length){
                    break;
                }
            }
       }
    return false;
    }
}
