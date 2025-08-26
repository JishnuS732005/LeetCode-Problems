class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDia = 0;
        int maxArea = 0;
        for(int i=0;i<dimensions.length;i++) {
            int l = dimensions[i][0];
            int w = dimensions[i][1];
            double dia = Math.sqrt(l*l + w*w);
            int a = l*w;
            if(dia>maxDia || (dia == maxDia && a>maxArea)) {
                maxDia = dia;
                maxArea = a;
            }
        }
        return maxArea;
    }
}