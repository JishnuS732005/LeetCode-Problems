class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        for(int i=0;i<nums2.length;i++) {
            a2.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++) {
            for(int j=0;j<a2.size();j++) {
                if(nums1[i] == a2.get(j)) {
                    a1.add(nums1[i]);
                    a2.remove(j);
                    break;
                }
            }
        }
        int a[] = new int[a1.size()];
        for(int i=0;i<a1.size();i++) {
            a[i] = a1.get(i);
        }
        return a;
    }
}