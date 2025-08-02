class Solution {
    public boolean isPalindrome(String s) {
        char ch[] = s.toLowerCase().toCharArray();
        String str = "";
        for(int i=0;i<s.length();i++) {
            if(ch[i]>='a' && ch[i]<='z' || ch[i]>='0' && ch[i]<='9') {
                str += ch[i];
            }
        }
        System.out.print(str);
        String rev = "";
        for(int i=s.length()-1;i>=0;i--) {
            if(ch[i]>='a' && ch[i]<='z' || ch[i]>='0' && ch[i]<='9') {
                rev += ch[i];
            }
        }
        System.out.println();
        System.out.print(rev);
        if(str.equals(rev)) {
            return true;
        }
        else {
            return false;
        }
    }
}