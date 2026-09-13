class Solution {
    public int maxProfit(int[] prices) {
        
        int minValue = prices[0];
        int maxProfit = 0;
        int n = prices.length;

        for(int i = 1; i<n; i++){

            minValue = Math.min(minValue, prices[i]);
            maxProfit = Math.max(maxProfit,(prices[i] - minValue));
        }
    return maxProfit;
    }
}
