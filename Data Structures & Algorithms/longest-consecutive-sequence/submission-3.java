class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int currentStrek = 1;
        int longest = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }

            if(nums[i] == nums[i-1]+1){
                currentStrek++;
            }else{
                currentStrek =1;
            }
            longest = Math.max(longest,currentStrek);
        }
    return longest;
    }
}
