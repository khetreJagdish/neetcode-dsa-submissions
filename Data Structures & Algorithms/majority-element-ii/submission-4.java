class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list  = new ArrayList<>();
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int num : nums){
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);

            if(hashMap.get(num) > nums.length/3 && !list.contains(num)){
                list.add(num);
            }
        }
    return list;
    }
}