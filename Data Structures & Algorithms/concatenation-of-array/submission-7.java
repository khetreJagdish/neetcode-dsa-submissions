class Solution {
    public int[] getConcatenation(int[] nums) {
        int numSize = nums.length;
        int[] ans = new int[2*numSize];

        for(int i = 0; i<numSize;i++){
            ans[i] = nums[i];
            ans[i+numSize] = nums[i];
        }
    return ans;
    }
}