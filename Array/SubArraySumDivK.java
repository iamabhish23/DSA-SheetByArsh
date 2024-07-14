import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0;
        int ans = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int comp = ((sum % k) + k) % k;
            if (map.containsKey(comp)) {
                ans += map.get(comp);
            }
            map.put(comp, map.getOrDefault(comp, 0) + 1);
        }
        
        return ans;
    }
}
