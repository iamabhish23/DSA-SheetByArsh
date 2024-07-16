class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long ans = Integer.MAX_VALUE;
        if(m>n){
            return -1;
        }
        for(int i =0; i<=n-m; i++){
            
            int diff = a.get(m+i-1)-a.get(i);
            ans = Math.min(ans, diff);
        }
        return ans;
    }
}
