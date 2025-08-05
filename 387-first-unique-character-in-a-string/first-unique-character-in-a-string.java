class Solution {
    public int firstUniqChar(String s) {
        char ch[] = s.toCharArray();
        int len = s.length();
        if(len == 1) {
            return 0;
        }
        int fre[] = new int[26];
        for(int i=0;i<len;i++) {
            if(ch[i]>='a' && ch[i]<='z') {
                fre[(int)ch[i]-97]++;
            }
        }
        for(int i=0;i<len;i++) {
            if(fre[ch[i]-97] == 1) {
                return i;
            }
        }
        return -1;
    }
}