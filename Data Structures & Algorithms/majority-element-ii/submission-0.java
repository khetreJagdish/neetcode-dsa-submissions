class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int size = nums.length;
        
        Set<Integer> set = new HashSet();
        for(int i = 0;i <size; i++){
            int count = 0;
            for(int j = i; j<size; j++){

                if(nums[i] == nums[j]){
                    count++;
                }
            }

            if(count > size/3){
                set.add(nums[i]);
            }
        }
    return new ArrayList(set);
    }
}