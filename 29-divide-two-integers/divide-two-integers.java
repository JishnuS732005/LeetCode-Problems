class Solution {
    public int divide(int dividend, int divisor) {
        int div = dividend/divisor;
        return (dividend == Integer.MIN_VALUE && divisor == -1) ? Integer.MAX_VALUE : div;
    }
}