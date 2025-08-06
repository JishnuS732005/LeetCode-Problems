class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i=0;i<sentences.length;i++) {
            String words = sentences[i];
            String s[] = words.split(" ");
            if(s.length>max) {
                max = s.length;
            }
        }
        return max;
    }
}