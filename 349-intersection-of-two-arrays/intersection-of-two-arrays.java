class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i=0;i<nums1.length;i++) {
            if(a1.contains(nums1[i])) {
                continue;
            }
            for(int j=0;j<nums2.length;j++) {
                if(nums1[i] == nums2[j]) {
                    a1.add(nums1[i]);
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