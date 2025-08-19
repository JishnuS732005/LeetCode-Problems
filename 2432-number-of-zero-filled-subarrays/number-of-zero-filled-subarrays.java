class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long consecutive = 0;
        long c = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) {
                consecutive++;
                c += consecutive; 
            }
            else {
                consecutive = 0;
            }
        }
        return c;
    }
}