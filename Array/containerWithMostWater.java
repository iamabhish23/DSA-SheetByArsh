class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int start = 0;
        int end = height.length-1;
        while(start<end){
            int len = Math.min(height[start], height[end]);
            int vol = len*(end-start);
            ans = Math.max(vol, ans);
            if(height[end]<height[start]){
                end--;
            }else{
                start++;
            }
        }
        return ans;
    }
}
