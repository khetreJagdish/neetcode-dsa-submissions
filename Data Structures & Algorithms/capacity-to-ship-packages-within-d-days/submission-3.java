class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int minWeight = 0;
        int maxWeight = 0;

        for(int i =0; i<weights.length; i++){
            maxWeight += weights[i];
            minWeight = Math.max(minWeight,weights[i]);
        }

        for(int i =minWeight; i<=maxWeight; i++){

           int daysPossible =  checkIfPossibleWithinDays(weights,i);

           if(daysPossible<=days){
                return i;
           }
        }
    return -1;
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