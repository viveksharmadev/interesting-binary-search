// https://leetcode.com/problems/kth-missing-positive-number/
class Solution {
    // tc -> n, sc-> n
    public int findKthPositive(int[] arr, int k) {
        int num = 1;
        
        int i = 0;
        
        List<Integer> result = new ArrayList<>();
        
        while(i < arr.length){
            
            if(arr[i] != num){
                result.add(num);
            }
            
            else{
                i++;    
            }
            
            num++;
        }
        
        int count = k;
        
        while(count-- > 0){
            result.add(num++);
        }
        
        return result.get(k-1);
    }
}

/*
Explanation
Assume the final result is x,
And there are m number not missing in the range of [1, x].
Binary search the m in range [0, A.size()].

If there are m number not missing,
that is A[0], A[1] .. A[m-1],
the number of missing under A[m] - 1 is A[m] - 1 - m.

If A[m] - 1 - m < k, m is too small, we update left = m.
If A[m] - 1 - m >= k, m is big enough, we update right = m.

Note that, we exit the while loop, l = r,
which equals to the number of missing number used.
So the Kth positive number will be l + k.

*/

class Solution {
    // tc -> logn, sc-> 1
    public int findKthPositive(int[] arr, int k) {
        int start = 0, end = arr.length;
        
        while(start < end){
            
            int mid = start + (end-start)/2;
            
            if(arr[mid]-1-mid < k){
                start = mid+1;
            }
            
            else{
                end = mid;
            }
        }
        
        return start + k;
    }
}
