class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int[] s1Array = new int[26];

        for(int i = 0; i<s1.length();i++){
            s1Array[s1.charAt(i)-'a']++;
        }

        for(int i =0; i<=s2.length()-s1.length(); i++){

            int[] s2Array = new int[26];
            for(int j = i; j<i+s1.length(); j++){

                s2Array[s2.charAt(j) - 'a']++;
            }

            if(Arrays.equals(s1Array,s2Array)){
                return true;
            }
        }
    return false;
    }
}
