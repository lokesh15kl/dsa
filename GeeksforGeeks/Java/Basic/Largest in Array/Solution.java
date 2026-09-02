class Solution {
    public static int largest(int[] arr) {
        // code here
       // ans = 0;
       int ans = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            
            ans = Math.max(ans,arr[i]);
        }
    
        return ans;
}
}