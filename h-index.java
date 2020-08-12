// https://leetcode.com/problems/h-index/
class Solution {
    // tc -> nlogn, sc-> n
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int start = 0, end = citations.length;
        for(int citation : citations){
            if(citation >= end-start) return end-start;
            else start++;
        }
        return 0;
    }
}
