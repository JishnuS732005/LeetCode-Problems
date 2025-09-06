class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int c = 0;
        while(i>=0 || j>=0 || c == 1) {
            int total = c;
            if(i>=0) total += a.charAt(i--) - '0';
            if(j>=0) total += b.charAt(j--) - '0';
            s.append(total % 2);
            c = total/2;
        }
        return s.reverse().toString();
    }
}