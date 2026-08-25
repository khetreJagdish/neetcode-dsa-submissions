class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int maxCount = 1;
        int count = 1;
        Arrays.sort(nums);
        for(int i = 1; i<nums.length; i++){
            // Skip simillar elements
            if(nums[i] == nums[i-1]) continue;

            // Consecutive number
            if(nums[i] == nums[i-1]+1){
                count++;
            }else{
                // Sequence Broken
                count = 1;
            }
        maxCount = Math.max(maxCount,count);
        }
    return maxCount;
    }
}
