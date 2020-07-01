// https://leetcode.com/problems/arranging-coins/
class arranging-coins {
    // tc -> n, sc-> 1
    public int arrangeCoins(int n) {
        int count = 0;
        while(n > 0){                        
            count++;            
            n -= count;
        }
        return n==0 ? count : count-1;
    }
    
    // tc -> logn, sc-> 1
    public int arrangeCoins(int n) {
        long start = 0, end = n;
        
        while(start <= end){
            long mid = start + (end-start)/2;
            
            long currSum = mid*(mid+1)/2;
            
            if(currSum == n) return (int)mid;
            
            if(currSum > n){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        
        return (int)end;
    }
}
