class Solution {
    public int maxProfit(int[] prices) {

        int lowestPrice = prices[0];
        int maxProfit = 0;
        
        for(int i = 1; i<prices.length; i++){

            if(prices[i] < lowestPrice){
                lowestPrice = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i]-lowestPrice );
        }
    return maxProfit;  
    }
}
