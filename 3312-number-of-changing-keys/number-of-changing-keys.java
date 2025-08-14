class Solution {
    public int countKeyChanges(String s) {
        s = s.toLowerCase();
        int c = 0;
        char ch[] = s.toCharArray();
        for(int i=0;i<s.length()-1;i++) {
            if(ch[i] - ch[i+1] != 0) {
                c++;
            }
        }
        return c;
    }
}