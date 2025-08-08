class Solution {
    public int countDigits(int num) {
        if(num > 0) {
            int temp = num;
            int c = 0;
            while(temp != 0) {
                int digit = temp % 10;
                if(num % digit == 0) {
                    c++;
                }
                temp /= 10;
            }
            return c;
        }
        else {
            return 1;
        }
    }
}