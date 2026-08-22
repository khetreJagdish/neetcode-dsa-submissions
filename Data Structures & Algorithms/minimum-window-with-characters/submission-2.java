class Solution {
    public String minWindow(String s, String t) {
        
        int[] tArray = new int[128];
        int required = t.length();
        int minWindowLength = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int startIndex = 0;
        // add t into freq array
        for(Character c : t.toCharArray()){
            tArray[c]++;
        }

        while(right  < s.length()){
            
            char character = s.charAt(right);
            if(tArray[character] > 0){
                required--;
            }

            tArray[character]--;

            while(required == 0){
                int currentWindow = right - left + 1;

                if(currentWindow < minWindowLength ){
                    minWindowLength = currentWindow;
                    startIndex = left;
                }
                char leftChar = s.charAt(left);
                tArray[leftChar]++;

                if(tArray[leftChar] > 0){
                    required++;
                }
                left++;
            }
            right++;
        }
    return minWindowLength == Integer.MAX_VALUE ? "" : s.substring(startIndex,startIndex+minWindowLength);
    }
}
