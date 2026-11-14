class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        int right = 0;
        HashSet<Character> hashSet = new HashSet<>();

        while(right < s.length()){

            while(hashSet.contains(s.charAt(right))){
                hashSet.remove(s.charAt(left));
                left++;
            }
            hashSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, hashSet.size());
            right++;
        }
        return maxLength;
    }
}
