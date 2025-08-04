class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> h = new HashMap<>();
        if(s.length() == t.length()) {
            for(int i=0;i<s.length();i++) {
                if(!(h.containsKey(s.charAt(i)))) {
                    if(h.containsValue(t.charAt(i))) {
                        return false;
                    }
                    h.put(s.charAt(i),t.charAt(i));
                }
                else {
                    if(h.get(s.charAt(i)) != t.charAt(i))  {
                        return false;
                    }
                }
            }
            return true;
        }
        else {
            return false;
        }
    }
}