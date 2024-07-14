class Solution {
    int ans = 0;
    public int maxProfit(int[] prices) {
        int n = prices.length; 
        int min = prices[0];
        for(int i = 1; i<n; i++){
            if(prices[i]<min){
                min=prices[i];
            }
            ans = Math.max(ans, prices[i]-min);
        }
        return ans;
        
    }
}
