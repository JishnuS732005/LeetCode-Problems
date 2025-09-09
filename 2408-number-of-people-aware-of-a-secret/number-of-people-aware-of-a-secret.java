class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long[] d = new long[n + 1];
        long t = 0;
        final int DIV = (int)1e9 + 7;
        d[1] = 1;
        for (int i = delay + 1; i <= n; ++i) {
            if (i - forget > 0) {
                t = (t - d[i - forget] + DIV) % DIV;
            }
            t = (t + d[i - delay]) % DIV;
            d[i] = t;
        }
        for (int i = n - delay + 1; i <= n; ++i) {
            t = (t + d[i]) % DIV;
        }
        return (int)(t);
    }
}