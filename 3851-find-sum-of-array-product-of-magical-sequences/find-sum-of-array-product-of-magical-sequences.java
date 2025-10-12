class Solution {
    static final long MOD = 1000000007L;

    public int magicalSum(int m, int k, int[] nums) {
        int n = nums.length;
        
        long[][] powers = new long[n][m + 1];
        for (int j = 0; j < n; j++) {
            powers[j][0] = 1;
            long val = (long) nums[j] % MOD;
            for (int c = 1; c <= m; c++) {
                powers[j][c] = powers[j][c - 1] * val % MOD;
            }
        }
        
        long[] fact = new long[m + 1];
        fact[0] = 1;
        for (int i = 1; i <= m; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        long[] invFact = new long[m + 1];
        invFact[m] = modPow(fact[m], MOD - 2, MOD);
        for (int i = m - 1; i >= 0; i--) {
            invFact[i] = invFact[i + 1] * (i + 1) % MOD;
        }
        
        long[][][] dp = new long[m + 1][31][m + 1];
        long[][][] nextDp = new long[m + 1][31][m + 1];
        dp[0][0][0] = 1; 
        
        for (int bit = 0; bit < 60; bit++) {  
            for (int u = 0; u <= m; u++) {
                for (int c = 0; c <= 30; c++) {
                    for (int p = 0; p <= m; p++) {
                        nextDp[u][c][p] = 0;
                    }
                }
            }
            
            for (int used = 0; used <= m; used++) {
                for (int carryIn = 0; carryIn <= 30; carryIn++) {
                    for (int pop = 0; pop <= m; pop++) {
                        long val = dp[used][carryIn][pop];
                        if (val == 0) continue; 
                        
                        int maxC = (bit < n) ? m - used : 0; 
                        for (int c = 0; c <= maxC; c++) {
                            long contrib = (bit < n) ? powers[bit][c] * invFact[c] % MOD : 1L;
                            int total = c + carryIn;
                            int bitVal = total % 2;  
                            int carryOut = total / 2;
                            int newPop = pop + bitVal;
                            if (newPop > m) continue; 
                            
                            int newUsed = used + c;
                            nextDp[newUsed][carryOut][newPop] = 
                                (nextDp[newUsed][carryOut][newPop] + val * contrib % MOD) % MOD;
                        }
                    }
                }
            }
            
            long[][][] temp = dp;
            dp = nextDp;
            nextDp = temp;
        }
        return (int) (dp[m][0][k] * fact[m] % MOD);
    }
    
    long modPow(long base, long exp, long mod) {
        long res = 1;
        base %= mod;
        while (exp > 0) {
            if (exp % 2 == 1) res = res * base % mod;
            base = base * base % mod;
            exp /= 2;
        }
        return res;
    }
}
