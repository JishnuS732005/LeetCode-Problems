class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int n = numBottles;
        int ex = numBottles;
        while(ex >= numExchange) {
            int e = ex / numExchange;
            n += e;
            ex = e + (ex % numExchange);
        }
        return n;
    }
}