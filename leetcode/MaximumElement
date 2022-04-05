class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hash_map = new HashMap<Integer, Integer>();
        int ans = nums[0];
        int count = 0;
        for(int i = 0; i < nums.length; i++) {            
            if (hash_map.containsKey(nums[i])) {
                count = Math.max(count, hash_map.get(nums[i]));
                hash_map.put(nums[i], hash_map.get(nums[i]) + 1);
                if (hash_map.get(nums[i]) > count)
                    ans = nums[i];
            } else {
                hash_map.put(nums[i], 1);
            }
        }
        return ans;
    }
}
