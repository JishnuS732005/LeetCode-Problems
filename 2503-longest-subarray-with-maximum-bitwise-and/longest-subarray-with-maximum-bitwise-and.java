class Solution {
    public int longestSubarray(int[] nums) {
        int maxValue = 0;
        for(int num : nums) {
            if(num > maxValue) {
                maxValue = num;
            }
        }
        int curr = 0;
        int maxLength = 0;
        for(int n : nums) {
            if(n == maxValue) {
                curr++;
                if(curr > maxLength) maxLength = curr;
            }
            else {
                curr = 0;
            }
        }
        return maxLength;
    }
}