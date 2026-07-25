class Solution {
    public boolean isAnagram(String s, String t) {

        int[] arr = new int[26];
        int[] arr1 = new int[26];

        for(char c : s.toCharArray()){
            arr[c - 'a']++;
        }

        for(char c : t.toCharArray()){
            arr1[c - 'a']++;
        }
        
        
        return Arrays.equals(arr,arr1);
    }
}
