class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l1 = new ArrayList<>();
        for(int i=0;i<words.length;i++) {
            String s = words[i];
            if(s.indexOf(x) != -1) {
                l1.add(i);
            }
        }
        return l1;
    }
}