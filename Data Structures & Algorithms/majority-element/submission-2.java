class Solution {
    public int majorityElement(int[] nums) {
        
        int currentElement = 0;
        int count  = 0;
        int n = nums.length;
        for(int i = 0; i<n; i++){
            if(count == 0){
                currentElement = nums[i];
                count = 1;
            }else if(currentElement == nums[i]){
                count++;
            }else{
                count--;
            }
            
        }
    return currentElement;
    }
}