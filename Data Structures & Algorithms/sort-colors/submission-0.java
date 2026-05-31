class Solution {
    public void sortColors(int[] nums) {
        
        int numberOfZeroes = 0;
        int numberOfOnes = 0;
        int numberOfTwos = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 0){
                numberOfZeroes++;
            }
             if(nums[i] == 1){
                numberOfOnes++;
            }
             if(nums[i] == 2){
                numberOfTwos++;
            }
        }

        for(int i = 0; i< nums.length; i++){
            if(numberOfZeroes > 0){
                nums[i] = 0; 
                numberOfZeroes--;
            }else if(numberOfOnes > 0){
                nums[i] = 1;
                numberOfOnes--;
            }else{
                nums[i] = 2;
                numberOfTwos--;
            }
        }
    }
}