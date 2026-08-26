class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int arrayLength = arr.length;
        int leftIndex = 0;
        int rightIndex = arrayLength-k;

        while(leftIndex < rightIndex){

            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;

            if(Math.abs(x - arr[middleIndex]) > Math.abs(x - arr[middleIndex+k])){
                leftIndex = middleIndex + 1;
            }else{
                rightIndex = middleIndex;
            }
        }
        List<Integer> answerList = new ArrayList<>();
        for(int startIndex = leftIndex; startIndex < leftIndex + k; startIndex++){
            answerList.add(arr[startIndex]);
        }
    return answerList;
    }
}