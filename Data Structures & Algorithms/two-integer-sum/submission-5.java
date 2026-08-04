class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        HashMap<Integer,Integer> frequencyMap = new HashMap<>();
        int[] ans = {-1,-1};
        for(int i = 0; i<size; i++){
            int partner = target - nums[i];
            if(frequencyMap.containsKey(partner)){
                ans = new int[]{i, frequencyMap.get(partner)};
                break;
            }
            frequencyMap.put(nums[i],i);
        }
    Arrays.sort(ans);
    return ans;
    }
}
