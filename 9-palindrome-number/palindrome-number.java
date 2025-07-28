class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        if(x < 0) {
            return false;
        }
        for(int i=x;i>0;i/=10) {
            int digit = i%10;
            rev = rev * 10 + digit;
        }
        return temp == rev;
    }
}