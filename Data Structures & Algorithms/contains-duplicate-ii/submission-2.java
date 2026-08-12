class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         
         for(int i = 0; i<nums.length; i++){

            for(int j = i; j<nums.length; j++){

                if(i != j && Math.abs(i - j) <= k && nums[i] == nums[j]){
                        return true;
                }
            }
         }
        return false;
    }
}