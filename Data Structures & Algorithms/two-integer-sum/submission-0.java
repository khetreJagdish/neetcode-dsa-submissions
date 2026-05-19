class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int reminder = target - nums[i];

            if(hashMap.containsKey(reminder)){
                return new int[] {hashMap.get(reminder) , i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[]{-1,-1};

    }
}
