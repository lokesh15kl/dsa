class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> ans = new ArrayList();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        
            
        }
        ans.add(min);
        ans.add(max);
        return ans;
    }
}
