class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int size = nums.length;
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i = 0; i<size; i++){
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i],0)+1);
        }

        return hashMap.entrySet()
        .stream()
        .filter(entry -> entry.getValue() > size/3)
        .map(Map.Entry::getKey)
        .limit(2)
        .toList();

    }
}