class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        return modifiedBinarySearch(nums,target,left,right);
    }

    public int modifiedBinarySearch(int[] nums, int target, int left, int right){

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[left] <= nums[mid]){
                if(nums[left]<= target && target <= nums[mid]){
                    return modifiedBinarySearch(nums,target,left,mid);
                }else{
                    return modifiedBinarySearch(nums,target,mid+1,right);
                }
            }else{
                if(nums[mid] <= target && target <= nums[right]){
                    return modifiedBinarySearch(nums,target,mid,right);
                }else{
                    return modifiedBinarySearch(nums,target,left,mid-1);
                }
            }
        }
        return -1;
    }
}
