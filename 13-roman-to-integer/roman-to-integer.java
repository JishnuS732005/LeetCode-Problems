class Solution {
    public int romanToInt(String s) {
        char ch[] = s.toCharArray();
        int sum = 0;
        int preSum = 0;
        for(int i=s.length()-1;i>=0;i--) {
            int v = 0;
            if(ch[i] == 'I') v += 1;
            else if(ch[i] == 'V') v += 5;
            else if(ch[i] == 'X') v += 10;
            else if(ch[i] == 'L') v += 50;
            else if(ch[i] == 'C') v += 100;
            else if(ch[i] == 'D') v += 500;
            else if(ch[i] == 'M') v += 1000;

            if(v < preSum) {
                sum -= v;
            }
            else {
                sum += v;
            }
            preSum = v;
        }
        return sum;
    }
}