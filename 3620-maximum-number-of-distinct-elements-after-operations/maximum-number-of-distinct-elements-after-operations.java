class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int c = 1;
        int prev = nums[0] - k;
        for(int i=1;i<nums.length;i++) {
            int min = nums[i]-k;
            int max = nums[i]+k;
            if(min > prev) {
                c++;
                prev = min;
            }
            else if(prev < max) {
                prev = prev+1;
                c++;
            }
            else {
                continue;
            }
        }
        return c;
    }
}