class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        for(int j=0;j<nums.length;j++) {
            if(nums[j]>target) {
                return j;
            }
        }
        for(int k=0;k<nums.length;k++) {
            if(target<=nums[k]) {

            }
            pos = k+1;
        }
        return pos;
    }
}