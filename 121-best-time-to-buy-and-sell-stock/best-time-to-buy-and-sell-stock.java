class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        int low=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(prices[i]<low){
                low=prices[i];
            }
            profit =Math.max(profit,(prices[i]-low));

        }
            return profit;
        }
        
}
