class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int element = target - nums[i];
            if(hashMap.containsKey(element)){
                return new int[] {hashMap.get(element),i};
            }
            hashMap.putIfAbsent(nums[i],i);
        }
    return new int[] {-1,-1};
    }
}
