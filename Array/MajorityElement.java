class Solution {
    public int majorityElement(int[] nums) {
        int var = nums[0];
        int count = 1;
        for(int i =1; i<nums.length; i++){
            if(count==0){
                var=nums[i];
                count=1;
            }else if(var==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        int ans=0;
        if(count>0){
            for(int i = 0; i<nums.length; i++){
                if(nums[i]==var){
                    ans++;
                }
            }
        }
        if(ans>nums.length/2){
            return var;
        }else{
            return -1;
        }
         
    }
}
