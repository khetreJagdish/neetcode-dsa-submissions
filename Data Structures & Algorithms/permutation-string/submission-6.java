class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int[] s1Array = new int[26];
        for(int i = 0; i<s1.length(); i++){
            s1Array[s1.charAt(i) - 'a']++;
        }

        int[] s2Array = new int[26];
        int i = 0;
        for(int j = 0; j<s2.length(); j++){
            s2Array[s2.charAt(j) - 'a']++;

            while((j-i+1) > s1.length()){
                s2Array[s2.charAt(i)-'a']--;
                i++;
            }

            if(Arrays.equals(s1Array,s2Array)){
                return true;
            }
            
        }
    return false;
    }
}
