class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
        //- If the current number is already in the window(set), return true.
            if (window.contains(nums[i])) {
                return true;
            }
        // - Otherwise, add it to the window.
            window.add(nums[i]);


        //- If the window grows beyond k, remove the element that is too far away.
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }
    return false;
    }
}