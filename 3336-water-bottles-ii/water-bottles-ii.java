class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int full = 0;
        int emp = numBottles;
        int drunk = numBottles;
        while(emp >= numExchange) {
            emp = emp - numExchange;
            numExchange++;
            emp += 1;
            drunk += 1;
        }
        return drunk;
    }
}