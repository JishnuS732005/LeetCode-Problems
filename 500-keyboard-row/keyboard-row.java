class Solution {
    public String[] findWords(String[] words) {
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        ArrayList<String> a = new ArrayList<>();
        for(int i=0;i<words.length;i++) {
            String s = words[i].toLowerCase();
            int flag = 0;
            if(r1.indexOf(s.charAt(0)) != -1) {
                for(int j=0;j<s.length();j++) {
                    if((r1.indexOf(s.charAt(j)))==-1) {
                        flag = 1;
                        break;
                    }
                }
            }
            else if(r2.indexOf(s.charAt(0)) != -1) {
                for(int j=0;j<s.length();j++) {
                    if((r2.indexOf(s.charAt(j))) == -1) {
                        flag = 1;
                        break;
                    }
                }
            }
            else if(r3.indexOf(s.charAt(0)) != -1) {
                for(int j=0;j<s.length();j++) {
                    if(r3.indexOf(s.charAt(j)) == -1) {
                        flag = 1;
                        break;
                    }
                }
            }
            if(flag == 0) {
                a.add(words[i]);
            }
        }
        String str[] = new String[a.size()];
        for(int i=0;i<a.size();i++) {
            str[i] = a.get(i);
        }
        return str;
    }
}