class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++) {
            char ch[] = words[i].toCharArray();
            int len = ch.length;
            int k = len-1;
            int flag = 0;
            int j = 0;
            while(j<k) {
                if(ch[j] != ch[k]) {
                    flag = 1;
                    break;
                }
                j++;
                k--;
            }
            if(flag == 0) return words[i];
        }
        return "";
    }    
}