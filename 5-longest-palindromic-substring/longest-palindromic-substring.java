class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1) {
            return s;
        }
        int m = 1;
        String maxS = s.substring(0, 1);
        for(int i=0;i<s.length();i++) {
            for(int j=i+m;j<=s.length();j++) {
                if(j-i > m && isPalindrome(s.substring(i,j))) {
                    m = j-i;
                    maxS = s.substring(i, j);
                }
            }
        }
        return maxS;
    }

    private boolean isPalindrome(String str) {
        int l = 0;
        int r = str.length()-1;;
        while(l<r) {
            if(str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}