class Solution {
    public boolean checkIfPangram(String sentence) {
        char ch[] = sentence.toCharArray();
        int len = sentence.length();
        int fre[] = new int[26];
        for(int i=0;i<len;i++) {
            if(ch[i]>='a' && ch[i]<='z') {
                fre[ch[i]-'a']++;
            }
        }
        int flag = 0;
        for(int i=0;i<26;i++) {
            if(fre[i] == 0) {
                flag = 1;
            }
        }
        if(flag == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}