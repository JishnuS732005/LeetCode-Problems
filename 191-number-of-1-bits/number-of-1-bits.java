class Solution {
    public int hammingWeight(int n) {
        String bin = Integer.toBinaryString(n);
        char[] ch = bin.toCharArray();
        int c = 0;
        for(int i=0;i<bin.length();i++) {
            if(ch[i] == '1') {
                c++;
            }
        }
        return c;
    }
}