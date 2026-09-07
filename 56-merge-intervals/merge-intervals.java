// class Solution {
//     public int[][] merge(int[][] intervals) {
        
//     }
// }


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Edge case: if there are no intervals or only one, no merging is needed
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        // 1. Sort intervals by their starting value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        
        // Initialize the first interval as our starting point
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        // 2. Iterate and merge overlapping intervals
        for (int[] nextInterval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = nextInterval[0];
            int nextEnd = nextInterval[1];

            if (nextStart <= currentEnd) {
                // There is an overlap; update the end boundary of the current interval
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // No overlap; move to the next interval and add it to the list
                currentInterval = nextInterval;
                merged.add(currentInterval);
            }
        }

        // 3. Convert the list back into a 2D array
        return merged.toArray(new int[merged.size()][]);
    }
}