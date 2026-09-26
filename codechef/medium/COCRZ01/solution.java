class Solution {
    public int findMinimumRemovals(List<int[]> intervalList) {
        // write your code here 
        int n = intervalList.size();
        int[][] intervals = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            int interval[] = intervalList.get(i);
            
            intervals[i][0] = interval[0];
            intervals[i][1] = interval[1];
        }
        
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        
       
        /* 
        int count = 0;
        int endTime = -1;
        
        for (int i = 0; i < n; i++) {
            if (intervals[i][0] < endTime) {
                count++;
                continue;
            }
            
            endTime = Math.max(endTime, intervals[i][1]);
            
        }
        
        return count;
        */
        
        int count = 1;
        int endTime = intervals[0][1];
        
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] >= endTime) {
                count++;
            }
            
            endTime = Math.min(endTime, intervals[i][1]);
            
        }
        
        return n - count;
        
    }
}