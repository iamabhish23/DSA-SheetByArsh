class Solution {
    public boolean canJump(int[] nums) {
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (pointer < i) {
                return false;
            }
            pointer = Math.max(pointer, i + nums[i]);
        }
        return true;
    }
}
