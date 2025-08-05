class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i=0;i<digits.length;i++) {
            a1.add(digits[i]);
        }
        int c = 1;
        for(int i=a1.size()-1;i>=0;i--) {
            int sum = a1.get(i) + c;
            a1.set(i,sum%10);
            c = sum/10;
        }
        if(c!=0) {
            a1.add(0,c);
        }
        int arr[] = new int[a1.size()];
        for(int i=0;i<a1.size();i++) {
            arr[i] = a1.get(i);
        }
        return arr;
    }
}