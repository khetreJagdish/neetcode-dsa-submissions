class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int minCapacity = 0;
        int maxCapacity = 0;
        
        for(int i = 0; i<weights.length; i++){
            maxCapacity += weights[i];
            minCapacity = Math.max(minCapacity,weights[i]);
        }
        
        int left = minCapacity;
        int right = maxCapacity;

        while(left <= right){
            int mid = left + (right - left)/2;

            int daysRequired = findNumberOfDays(weights,mid);
            if(daysRequired <= days){
                right = mid - 1;
            }else{
                left = mid+1;
            }
        }

    return left;
    }

    private int findNumberOfDays(int[] weights, int capacity){

        int days = 1;
        int load = 0;

        for(int i = 0; i<weights.length; i++){

            if(weights[i]+load > capacity){
                days = days +1;
                load = weights[i];
            }else{
                load = load + weights[i];
            }
        }
        return days;
    }
}