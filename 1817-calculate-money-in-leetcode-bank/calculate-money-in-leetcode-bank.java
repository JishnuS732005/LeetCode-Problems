class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int c = 0;
        int mon = 0;
        for(int i=1;i<=n;i++) {
            if(c == 7) {
                mon = i/7+1;
                c = 0;
            }
            else {
                mon++;
            }
            sum += mon;
            c++;
        }
        return sum;
    }
}