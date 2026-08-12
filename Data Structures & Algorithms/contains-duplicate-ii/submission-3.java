class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hashSet = new HashSet<>();
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (right - left > k) {
                hashSet.remove(nums[left]);
                left++;
            }
            if (hashSet.contains(nums[right])) {
                return true;
            }
            hashSet.add(nums[right]);
            right++;
        }
        return false;
    }
}