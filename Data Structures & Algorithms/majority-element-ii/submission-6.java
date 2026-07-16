class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int candidate1 = 0;
        int candidate2 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int num : nums){
            
            if(candidate1 == num){
                count1++;
            }else if(candidate2 == num){
                count2++;
            }else if(count1 == 0){
                candidate1 = num;
                count1 = 1;
            }else if(count2 == 0){
                candidate2 = num;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }

        int candidate1Count = 0;
        int candidate2Count = 0;

        for(int num : nums){
            if(num == candidate1){
                candidate1Count++;
            }else if(num == candidate2){
                candidate2Count++;
            }
        }

        if(candidate1Count > nums.length/3) list.add(candidate1);
        if(candidate2Count > nums.length/3) list.add(candidate2);

    return list;
    }
}