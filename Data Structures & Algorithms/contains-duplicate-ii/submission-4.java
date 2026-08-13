class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        int i = 0;
        int j = 0;
        HashSet<Integer> hashSet = new HashSet<>();
         while(j < nums.length){
            if((j-i) > k){
                hashSet.remove(nums[i]);
                i++;
            }
            if(hashSet.contains(nums[j])) return true;
            hashSet.add(nums[j]);
            j++;
        }
    return false;   
    }
}