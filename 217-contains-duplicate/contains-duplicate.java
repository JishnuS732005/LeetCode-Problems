class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s1 = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            if(s1.contains(nums[i])) {
                return true;
            }
            s1.add(nums[i]);
        }
        return false;
    }
}