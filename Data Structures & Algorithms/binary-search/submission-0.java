class Solution {
    public int search(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length-1;
        while(left <= right){

            int midIndex =  left  + (right - left)/ 2;

            if(nums[midIndex] == target){
                return midIndex;
            }

            if(nums[midIndex] < target){
                left = midIndex + 1;;
            }else{
                right = midIndex - 1;
            }
        }
        return -1;
    }
}
