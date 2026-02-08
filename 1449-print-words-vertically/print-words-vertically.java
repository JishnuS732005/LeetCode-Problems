class Solution {
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        int maxLen = 0;
        for(String w : words) {
            maxLen = Math.max(maxLen,w.length());
        }
        List<String> result = new ArrayList<>();
        for(int i=0;i<maxLen;i++) {
            StringBuilder sb = new StringBuilder();
            for(String w : words) {
                if(i < w.length()) {
                    sb.append(w.charAt(i));
                }
                else {
                    sb.append(' ');
                }
            }
            result.add(sb.toString().replaceAll("\\s+$", ""));
        }
        return result;
    }
}