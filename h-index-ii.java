// https://leetcode.com/problems/h-index-ii/
class h-index-ii {
    // tc -> n, sc-> 1
    public int hIndex(int[] citations) {
        int index = 0, n = citations.length;
        for(int c : citations){
            if(c >= n-index) return n-index;
            else index++;
        }
        return 0;
    }
    
    // tc -> logn, sc-> 1
    public int hIndex(int[] citations) {
        int n = citations.length;
        int start = 0, end = n-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(citations[mid] == n-mid) return citations[mid];
            else if(citations[mid] > n-mid) end = mid-1;
            else start = mid+1;
        }
        return n - (end+1); // n-start
    }
}
