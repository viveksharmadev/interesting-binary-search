// https://leetcode.com/problems/search-insert-position/
class search-insert-position {
    // tc -> logn, sc-> 1
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target==nums[mid]){
                return mid;    
            }else if(nums[mid] < target){
                start++;
            }else{
                end--;
            }
        }
        return start;
    }
}
