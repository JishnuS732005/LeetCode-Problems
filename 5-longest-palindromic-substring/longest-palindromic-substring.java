class Solution {
    public int start =0;
    public int end =0;
    public void isPalindrome(char[] arr, int idx){
        int r = idx;
        int n = arr.length;
        int l= idx;
        if( r> n-1){
            return;
        }
        while(r < n-1 && arr[r] == arr[r+1]){
            r++;
        }
        idx = r;
        while( l >0 && r< n-1 && arr[l-1] == arr[r+1]){
            l--;
            r++;
        }
        if( end -start < r-l){
            end = r;
            start =l;
        }
        isPalindrome(arr,idx+1);
    }

    public String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        isPalindrome(arr,0);
        return  s.substring(start,end+1);
        
    }
}