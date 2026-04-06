// Merge Intervals

package day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {
     public int[][] merge(int[][] intervals) {
        // step 1 - sort array
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // create list of result to store the final result / output
        List<int[]> result = new ArrayList<>();

        
        for (int[] interval : intervals) {
            
            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
                result.add(interval);
            } else {
                result.get(result.size() - 1)[1] = 
                    Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
