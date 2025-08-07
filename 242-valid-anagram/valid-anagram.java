class Solution {
    public boolean isAnagram(String s, String t) {
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();
        int fre1[] = new int[26];
        int fre2[] = new int[26];
        if(s.length() == t.length()) {
            for(int i=0;i<s.length();i++) {
                fre1[(int)ch1[i]-97]++;
                fre2[(int)ch2[i]-97]++;
            }
            int flag = 0;
            for(int i=0;i<26;i++) {
                if(fre1[i] != fre2[i]) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) return true;
            else return false;
        }
        else {
            return false;
        }
    }
}