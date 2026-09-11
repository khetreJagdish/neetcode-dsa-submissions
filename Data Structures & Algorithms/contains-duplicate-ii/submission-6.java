class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i<n; i++){

            if(hashMap.containsKey(nums[i])){
                if(i - hashMap.get(nums[i]) <= k){
                    return true;
                }
            }
            hashMap.put(nums[i],i);
        }
    return false;
    }
}