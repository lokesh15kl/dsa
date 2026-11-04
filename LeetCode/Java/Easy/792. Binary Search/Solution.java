//class Solution {
//    public int search(int[] nums, int target) {
//        for(int i =0;i<nums.length;i++){
//            if(target == nums[i]){
//                return i;
//            }
//        }
//        return -1;
//    }
//}

class Solution{
    public int search(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}