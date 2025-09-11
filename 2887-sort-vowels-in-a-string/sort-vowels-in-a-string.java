class Solution {
    public String sortVowels(String s) {
        char[] ch = s.toCharArray();
        List<Character> v = new ArrayList<>();
        for(char a : ch) {
            if(vowel(a)) {
                v.add(a);
            }
        }
        Collections.sort(v);
        int j = 0;
        for(int i=0;i<ch.length;i++) {
            if(vowel(ch[i])) {
                ch[i] = v.get(j++);
            }
        }
        return new String(ch);
    }
    public boolean vowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}