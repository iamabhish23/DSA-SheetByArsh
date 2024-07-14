class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int arr[] = new int[nums.length+1];
        for(int i = 0; i<nums.length; i++){
            if(arr[nums[i]]==1){
                ans.add(nums[i]);
                continue;
            }
            arr[nums[i]]++;
            
        }
        return ans;
    }
}
