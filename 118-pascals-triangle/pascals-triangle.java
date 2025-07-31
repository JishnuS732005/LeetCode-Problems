class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0;i<numRows;i++) {
            ArrayList<Integer> a1 = new ArrayList<>();
            for(int j=0;j<=i;j++) {
                if(j==0 || j==i) {
                    a1.add(1);
                }
                else {
                    int val = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                    a1.add(val);
                }
            }
            triangle.add(a1);
        }
        return triangle;
    }
}