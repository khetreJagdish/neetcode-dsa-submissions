class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int left = 0, right = 0;
        int maxLength = 0;
        int maxChar = 0;

        while (right < s.length()) {
            arr[s.charAt(right) - 'A']++;
            maxChar = Math.max(maxChar, arr[s.charAt(right) - 'A']);

            if ((right - left + 1) - maxChar > k) {
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}
