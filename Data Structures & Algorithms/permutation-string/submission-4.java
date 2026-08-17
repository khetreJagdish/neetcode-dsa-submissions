class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        int left = 0;
        int right = 0;
        int[] freq2 = new int[26];

        while (right < s2.length()) {
            freq2[s2.charAt(right) - 'a']++;

            while (right - left + 1 > s1.length()) {
                freq2[s2.charAt(left) - 'a']--;
                left++;
            }

            if (Arrays.equals(freq, freq2)) {
                return true;
            }
            right++;
        }
        return false;
    }
}
