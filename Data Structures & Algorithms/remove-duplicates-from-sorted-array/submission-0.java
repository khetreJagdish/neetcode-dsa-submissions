class Solution {
    public int removeDuplicates(int[] nums) {
        
        int length = nums.length;
        int i = 0;
        int j = 1;

        while(j < length){
            if(nums[i] != nums[j]){
                nums[++i] = nums[j];
            }
            j++;
        }
    return i+1;
    }
}