class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            int result = 1;
            int j = 0;

            while(j < nums.length){

                if(j != i){
                    result = result * nums[j];
                }
                j++;
            }
            ans[i] = result;
        }
    return ans;
    }
}  
