class Solution {
    public boolean isPalindrome(String s) {
        
        String plainString = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int start = 0;
        int end = plainString.length()-1;

        while(start < end){

            if(plainString.charAt(start) != plainString.charAt(end) ){
                return false;
            }
            start++;
            end--;
        }
    return true;
    }
}
