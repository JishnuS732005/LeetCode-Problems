class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> l1 = new ArrayList<>();
        if(digits.length() == 0) return l1;

        HashMap<Character, String> m = new HashMap<>();
        m.put('2',"abc");
        m.put('3',"def");
        m.put('4',"ghi");
        m.put('5',"jkl");
        m.put('6',"mno");
        m.put('7',"pqrs");
        m.put('8',"tuv");
        m.put('9',"wxyz");

        l1.add("");

        for(int i=0;i<digits.length();i++) {
            char c = digits.charAt(i);
            String s = m.get(c);
            List<String> l2 = new ArrayList<>();
            for(String str : l1) {
                for(int j=0;j<s.length();j++) {
                    l2.add(str+s.charAt(j));
                }
            }
            l1 = l2;
        }
        return l1;
    }
}