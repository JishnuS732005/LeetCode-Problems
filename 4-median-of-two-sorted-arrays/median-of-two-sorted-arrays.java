class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n[] = new int[n1+n2];
        int j = 0;
        for(int i=0;i<n1;i++) {
            n[j++] = nums1[i];
        }
        for(int i=0;i<n2;i++) {
            n[j++] = nums2[i];
        }
        Arrays.sort(n);
        int k = n.length;
        if(k%2 != 0) {
            return n[k/2];
        }
        else {
            return (n[(k/2)-1]+n[k/2])/2.0;
        }
    }
}