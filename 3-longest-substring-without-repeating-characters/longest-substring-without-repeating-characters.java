class Solution {
    public int lengthOfLongestSubstring(String s) {
        char ch[] = s.toCharArray();
        int maxLen = 0;
        int j = 0;
        Set<Character> s1 = new HashSet<>();
        for(int i=0;i<s.length();i++) {
            while(s1.contains(ch[i])) {
                s1.remove(ch[j]);
                j++;
            }
            s1.add(ch[i]);
            maxLen = Math.max(maxLen , i-j+1);
        }
        return maxLen;
    }
}