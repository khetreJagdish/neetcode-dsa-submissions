class Solution {
    public int splitArray(int[] nums, int k) {

        if(k > nums.length) return -1;
        
        int max = Integer.MIN_VALUE;
        int maxSum = 0;

        for(int i = 0; i<nums.length; i++){
            max = Math.max(max,nums[i]);
            maxSum += nums[i];
        } 

        for(int pages = max; pages <=maxSum; pages++){

            int students = calculatePages(nums,pages);
            if(students <= k){
                return pages;
            }
        }
    return -1;
    }

    public int calculatePages(int[] nums, int posiiblePages){

        int student = 1;
        int currentPages = 0;

        for(int i =0;i<nums.length; i++){

            if(currentPages + nums[i] <= posiiblePages){
                currentPages += nums[i];
            }else{
                student += 1;
                currentPages = nums[i];
            }      
        }
    return student;
    }
}