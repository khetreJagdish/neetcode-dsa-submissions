class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int num : nums){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> set  : hashMap.entrySet()){
            if(set.getValue() > nums.length/2) {
                return set.getKey();
            }
        }
        return -1;
    }
}