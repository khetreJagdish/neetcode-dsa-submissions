class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashSet<Integer> set = new HashSet<>();

        int left = 0;
        int right = 0;

        while(right < nums.length){

            if(set.contains(nums[right])){
                return true;
            }

            set.add(nums[right]);

            if(set.size()  > k){
                set.remove(nums[right - k]);
                left++;
            }
            right++;
        }
        return false;
    }
}