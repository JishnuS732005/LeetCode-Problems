class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] s = text.split(" ");
        int c = 0;
        char[] ch = brokenLetters.toCharArray();
        for(int i=0;i<s.length;i++) {
            boolean type = true;
            for(int j=0;j<ch.length;j++) {
                if(s[i].indexOf(ch[j]) != -1) {
                    type = false;
                    break;
                }
            }
            if(type) c++;
        }
        return c;
    }
}