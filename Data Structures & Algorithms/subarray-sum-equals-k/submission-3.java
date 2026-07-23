class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int cummulative_sum = 0;
        int total_subarry= 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(0,1);
        for(int num : nums){
            cummulative_sum += num;

            if(hashMap.containsKey(cummulative_sum - k)){
                total_subarry += hashMap.get(cummulative_sum -k);
            }
            hashMap.put(cummulative_sum,hashMap.getOrDefault(cummulative_sum,0)+1);
        }
        return total_subarry;

    }
}