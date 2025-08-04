class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> a1 = new HashMap<>();
        String str[] = s.split(" ");
        char ch[] = pattern.toCharArray();
        if(pattern.length() == str.length) {
            for(int i=0;i<str.length;i++) {
                if(!(a1.containsKey(ch[i]))) {
                    if(a1.containsValue(str[i])) {
                        return false;
                    }
                    a1.put(ch[i],str[i]);
                }
                else {
                    if(!(a1.get(ch[i]).equals(str[i]))) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }   
}