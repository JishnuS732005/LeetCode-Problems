class Solution {
    public boolean canAliceWin(int[] nums) {
        int n1 = 0;
        int n2 = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] > 9) {
                n1 += nums[i];
            }
            else {
                n2 += nums[i];
            }
        }
        if(n1 == n2) {
            return false;
        }
        else {
            return true;
        }
    }
}