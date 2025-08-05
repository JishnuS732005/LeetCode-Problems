class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int c = 0;
        for(int i=0;i<fruits.length;i++) {
            int flag=0;
            for(int j=0;j<baskets.length;j++) {
                if(fruits[i]<=baskets[j]) {
                    baskets[j] = Integer.MIN_VALUE;
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                c++;
            }
        }
        return c;
       
    }
}