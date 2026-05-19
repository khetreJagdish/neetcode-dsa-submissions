class Solution {
    public boolean isAnagram(String s, String t) {


        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray); // O(NlogN)
        Arrays.sort(tCharArray); // O(NlogN)
        if(Arrays.equals(sCharArray,tCharArray)){
            return true;
        }
        return false;
    }
}
