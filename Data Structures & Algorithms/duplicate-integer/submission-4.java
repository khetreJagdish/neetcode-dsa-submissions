class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i =0; i<nums.length;i++){
            if(hashSet.add(nums[i]) == false){
                return true;
            }
        }
        return false;

    }
}