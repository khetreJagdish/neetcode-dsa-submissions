class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int num : nums){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }

        return hashMap
                    .entrySet()
                    .stream()
                    .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                    .map(Map.Entry::getKey)
                    .limit(k)
                    .mapToInt(Integer::intValue)
                    .toArray();
    }
}
