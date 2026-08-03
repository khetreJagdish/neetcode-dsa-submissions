class Solution {
    public boolean hasDuplicate(int[] nums) {
        int size = nums.length;
        // sort the array
        Arrays.sort(nums);
        for(int i = 0; i<size-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
    return false;
    }
}