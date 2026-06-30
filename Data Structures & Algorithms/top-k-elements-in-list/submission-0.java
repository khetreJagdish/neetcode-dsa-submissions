class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int num : nums){
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }

        LinkedHashMap<Integer,Integer> linkedHashMap = hashMap
                                                        .entrySet()
                                                        .stream()
                                                        .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                                                        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2) -> e1, LinkedHashMap::new));


        int[] ans = linkedHashMap.keySet().stream().limit(k).mapToInt(Integer::intValue).toArray();                                                        
        return ans;
    }
}
