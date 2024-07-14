class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int check[] = new int[n];
        for(int i =0; i<nums.length; i++){
            if(check[nums[i]]==1){
                return nums[i];
            }
            check[nums[i]]++;
        }
        return -1;
    }
}
