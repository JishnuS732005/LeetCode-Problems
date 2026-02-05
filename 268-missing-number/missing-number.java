class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n*(n+1)/2;
        int sum = 0;
        for(int arr : nums) {
            sum += arr;
        }
        return expectedSum-sum;
    }
}