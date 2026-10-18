class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();

        while(low <= high){
            int mid =  low + (high-low)/2;
            if(isPossibleSpeed(piles,h,mid)){
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }

    boolean isPossibleSpeed(int[] piles, int h,int actualHours){
        

        long number_of_banana_per_hours = 0;

        for(int i = 0; i<piles.length; i++){
            number_of_banana_per_hours += (int)Math.ceil((double)piles[i]/actualHours);
        }

        if(number_of_banana_per_hours <= h ){
            return true;
        }
        return false;
    }
}
