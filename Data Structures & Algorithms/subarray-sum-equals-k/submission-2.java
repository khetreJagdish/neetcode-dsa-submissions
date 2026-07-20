class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int count = 0;
        int prefix_sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int num : nums){

            prefix_sum += num;

            if(map.containsKey(prefix_sum - k)){
                count += map.get(prefix_sum - k);
            }
            map.put(prefix_sum,map.getOrDefault(prefix_sum,0)+1);
        }
    return count;
    }
}