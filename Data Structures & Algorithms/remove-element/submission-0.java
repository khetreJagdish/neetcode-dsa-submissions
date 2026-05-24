class Solution {
    public int removeElement(int[] nums, int val) {
        
        int numbersNotEqualToK =  0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
                numbersNotEqualToK++;
            }
        }

        int k = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k++] = nums[i];
            }
        }

        for(int l = k; l<nums.length; l++){
            nums[k] = 0;
        }
    return numbersNotEqualToK;
    }
}