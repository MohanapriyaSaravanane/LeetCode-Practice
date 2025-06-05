class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0],sell = prices[0],profit = 0;
        for(int i=1;i<n;i++){
            if(prices[i]<buy) buy = prices[i];
            sell = prices[i];

            profit = Math.max(profit,sell-buy);
        }
        return profit;
    }
}
