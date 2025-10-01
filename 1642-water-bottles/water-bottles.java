class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int n = numBottles;
        int ex = numBottles;
        int sum = 0;
        while(ex >= numExchange) {
            int e = ex / numExchange;
            sum += e;
            int sum1 = e;
            int rem = ex % numExchange;
            ex = sum1 + rem;
        }
        return n + sum;

        // int ex = n / numExchange;
        // int rem = n % numExchange;
        // int sum = ex + rem;
        // int dr = sum / numExchange;
        // return n + ex + dr;
               
    }
}