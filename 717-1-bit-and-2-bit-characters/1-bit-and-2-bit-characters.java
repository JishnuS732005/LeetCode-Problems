class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
        int i = 0;
        while(i < len-1) {
            i += bits[i] + 1;
        }
        return i == len-1;
    }
}