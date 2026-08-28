class Solution {
    public int[] sortArray(int[] nums) {
        int length = nums.length;
        divide(nums,length);  
        return nums; 
    }

    public void divide(int[] nums, int totalSize){

        if(totalSize <= 1){
            return;
        }

        int mid = totalSize / 2;

        int[] leftArray = new int[mid];
        int[] rightArray = new int[totalSize-mid];

        for(int i = 0; i<mid; i++){
            leftArray[i] = nums[i];
        }

        for(int i = mid; i<totalSize; i++){
            rightArray[i-mid] = nums[i];
        }

        divide(leftArray,mid);

        divide(rightArray,totalSize-mid);

        merge(nums,leftArray,rightArray,mid,totalSize-mid);
    }

    public void merge(int[] nums, int[] leftArray, int[] rightArray, int left, int right){

        int i = 0;
        int j = 0;
        int k = 0;

        while(i <left && j <right){
            if(leftArray[i] <= rightArray[j]){
                nums[k++] = leftArray[i++];
            }else{
                nums[k++] = rightArray[j++];
            }
        }

        while(i < left){
            nums[k++] = leftArray[i++];
        }

        while(j < right){
            nums[k++] = rightArray[j++];
        }
    }
}