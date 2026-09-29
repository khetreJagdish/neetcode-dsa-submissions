class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int minWeight = 0;
        int maxWeight = 0;

        for(int i =0; i<weights.length; i++){
            maxWeight += weights[i];
            minWeight = Math.max(minWeight,weights[i]);
        }

        int left = minWeight;
        int right = maxWeight;

        while(left <= right){

            int mid = left + (right - left)/2;
            int daysPossible =  checkIfPossibleWithinDays(weights,mid);
            if(daysPossible <= days){
                right = mid -1;
            }else{
                left = mid+1;
            }

        }
    return left;
    }

    private int checkIfPossibleWithinDays(int[] weights, int maxCapacity){

        int day = 1;
        int maxCapacitySum = 0;

        for(int i =0; i<weights.length; i++){

            maxCapacitySum+=weights[i];
            if(maxCapacitySum > maxCapacity){
                maxCapacitySum = weights[i];
                day++;
            }   
        }
        return day;
    }
}