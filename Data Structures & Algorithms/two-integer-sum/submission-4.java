class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] ans = {-1,-1};
        for(int i = 0; i<size; i++){

            for(int j = i+1; j<size; j++){

                if(nums[i] + nums[j] == target){
                    ans = new int[]{i,j};
                }
            }
        }
    Arrays.sort(ans);
    return ans;
    }
}
