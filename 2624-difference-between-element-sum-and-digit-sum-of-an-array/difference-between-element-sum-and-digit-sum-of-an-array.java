class Solution {
    public int differenceOfSum(int[] nums) {
        int Elementsum = 0;
        int Digitsum = 0;
        for(int i=0;i<nums.length;i++) {
            Elementsum += nums[i];
            while(nums[i] != 0) {
                Digitsum += nums[i]%10;
                nums[i] /= 10;
            }
        }
        return Elementsum - Digitsum;

        

    }
}