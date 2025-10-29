class Solution {
    public int smallestNumber(int n) {
        if(n<=1)return 1;
        int k=2;
        while(k<=n){
            k=(k*2);
        }
        return k-1;
    }
}