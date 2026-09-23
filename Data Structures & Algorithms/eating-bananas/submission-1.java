class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        // find max and min
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<piles.length; i++){
            max = Math.max(max,piles[i]);
        }

        int low = 1;
        int high  = max;

        while(low <= high){

            int mid = low + (high-low)/2;

            int totalHours = findTotalHours(piles,mid);
            if(totalHours <= h){
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }
    return low;
    }

    private int findTotalHours(int[] piles, int numberOfBanana){

        int totalHours = 0;

        for(int i = 0; i<piles.length; i++){
            totalHours += Math.ceil((double)piles[i]/numberOfBanana);
        }
    return totalHours;
    }
}
