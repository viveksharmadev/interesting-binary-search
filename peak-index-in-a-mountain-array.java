// https://leetcode.com/problems/peak-index-in-a-mountain-array/
class Solution {
    // tc -> n, sc-> 1
    public int peakIndexInMountainArray(int[] nums) {
        for(int i=1; i<nums.length; i++){
            
            if(nums[i-1] > nums[i]) return i-1;
        }
        
        return nums.length-1;  
    }
}

class Solution {
    // tc -> logn, sc-> 1
    public int peakIndexInMountainArray(int[] nums) {
        int start = 0, end = nums.length-1;
        
        while(start < end){
            
            int mid = start + (end-start)/2;
            
            int mid2 = mid+1;
            
            if(nums[mid] < nums[mid2]){
                start = mid2;
            }
            
            else{
                end = mid; 
            }
        }
        
        return start;
    }
}
