class Solution {
    public String minWindow(String s, String t) {
        int[] mapT = new int[256];
        int[] mapS = new int[256];
        int sLength = s.length();
        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        int startIndex = 0;

        for (char ch : t.toCharArray()) {
            mapT[ch]++;
        }

        while (right < sLength) {
            mapS[s.charAt(right)]++;

            while (containsAll(mapS, mapT)) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    startIndex = left;
                }
                mapS[s.charAt(left)]--;
                left++;
            }
        right++;
        }
    return minLength == Integer.MAX_VALUE ? "" : s.substring(startIndex,startIndex+minLength);
    }

    private boolean containsAll(int[] mapS, int[] mapT) {
        for (int i = 0; i < 256; i++) {
            if (mapT[i] > mapS[i]) {
                return false;
            }
        }
        return true;
    }
}
