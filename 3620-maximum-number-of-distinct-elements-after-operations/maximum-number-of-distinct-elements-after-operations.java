class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        if(nums.length <= 2*k + 1) return nums.length;
        Arrays.sort(nums);
        int dis = 0;
        int l = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            int m = Math.max(l+1, nums[i]-k);
            if(m <= nums[i]+k) {
                dis++;
                l = m;
            }
        }
        return dis;
    }
}