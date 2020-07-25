// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
class find-minimum-in-rotated-sorted-array {
    // tc -> n, sc-> 1
    public int findMin(int[] nums) {
        int res = nums[0];
        int n = nums.length;
        for(int i=1; i<n; i++){  
            if(nums[i]>nums[i-1]) continue;
            else res = nums[i];
        }
        return res;
    }
    
    // tc -> logn, sc-> 1
    public int findMin(int[] nums) {
        int start = 0, end = nums.length-1;
        while(start < end){
            if(nums[start]<nums[end]) return nums[start];
            int mid = start + (end-start)/2;
            if(nums[mid]>=nums[start]) start = mid+1;
            else end = mid;
        }
        return nums[start];
    }
}
