class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int l = energy.length;
        int ans = Integer.MIN_VALUE;
        int[] dp = new int[l];
        for(int i=l-1;i>=0;i--) {
            dp[i] = energy[i] + (i+k < l ? dp[i+k] : 0);
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}