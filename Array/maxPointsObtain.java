class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length-1;
        int lSum = 0;
        int rSum = 0;
        for(int i =0; i<k; i++){
            lSum += cardPoints[i];
        }
        int ans = lSum;
        for(int i =0; i<k; i++){
            rSum += cardPoints[n-i];
            lSum -= cardPoints[k-1-i];
            ans = Math.max(ans, lSum+rSum);
        }
        return ans;
    }
}
