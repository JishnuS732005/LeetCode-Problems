class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos = 0; int flag = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == target) {
                pos = i;
                flag = 1;
                break;
            }
        }
        if(flag == 1) {
            return pos;
        }
        else {
            for(int i=0;i<nums.length;i++) {
                if(target<nums[i]) {
                    return i;
                }
            }
            return nums.length;
        }
    }
}