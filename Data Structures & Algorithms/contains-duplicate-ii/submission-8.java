class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashSet<Integer> hashSet = new HashSet<>();
        int n = nums.length;
        int i = 0;
        for(int j = 0; j<n; j++){

            if(hashSet.contains(nums[j])){
                    return true;
            }

            hashSet.add(nums[j]);
            
            if(hashSet.size() > k){
                hashSet.remove(nums[i]);
                i++;
            }
            
            
        }
    return false;
    }
}