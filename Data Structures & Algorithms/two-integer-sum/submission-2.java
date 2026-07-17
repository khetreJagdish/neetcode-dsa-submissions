class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hashMap = new HashMap();
        for(int i = 0; i<nums.length; i++){
            int element = target - nums[i];
            if(hashMap.containsKey(element)){
                int[] ans = new int[2];
                ans[0] = i;
                ans[1] = hashMap.get(element);
                Arrays.sort(ans);
                return ans;
            }else{
                hashMap.put(nums[i],i);
            }
        }
    return new int[]{-1,-1};
    }
}
