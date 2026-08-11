class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int num : nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }

        return freqMap
            .entrySet()
            .stream()
            .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
            .map(Map.Entry::getKey)
            .limit(k)
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
