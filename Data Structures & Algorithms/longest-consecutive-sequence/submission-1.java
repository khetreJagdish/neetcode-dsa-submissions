class Solution {
    public int longestConsecutive(int[] nums) {
        
        int max = 0;

        for(int num : nums){

            int current = num;
            int longest = 1;

            while(contains(nums,current+1)){
                current++;
                longest++;
            }
        max = Math.max(max,longest);
        }
    return max;

    }

    public boolean contains(int[] nums, int target){
        for(int num : nums){
            if(num == target){
                return true;
            }
        }
        return false;
    }
}
