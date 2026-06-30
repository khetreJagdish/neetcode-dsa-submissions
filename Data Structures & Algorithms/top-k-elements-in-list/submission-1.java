class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int num : nums){
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }

        int[] ans = hashMap
                            .entrySet()
                            .stream()
                            .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                            .limit(k)
                            .mapToInt(Map.Entry::getKey)
                            .toArray();
        return ans;
    }
}
