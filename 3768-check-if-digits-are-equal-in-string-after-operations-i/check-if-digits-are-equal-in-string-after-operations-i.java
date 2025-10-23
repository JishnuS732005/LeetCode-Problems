class Solution {
    public boolean hasSameDigits(String s) {
        int i = 0;
        String st = "";
        while(s.length() > 2 && i < s.length()-1 ) {
            st += (char) ((((s.charAt(i)-'0') + (s.charAt(i+1)-'0')) % 10) + '0');
            i++;
            if(i == s.length()-1) {
                s = st;
                i = 0;
                st = "";
            }
        }
        return s.length() == 2 && s.charAt(0) == s.charAt(1);
    }
}