// Pascal's Triangle II
// https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif

//            1            -- 0
//         1     1         -- 1
//       1    2     1      -- 2
//     1   3    3    1     -- 3
//   1   4    6    4    1  -- 4
// Input: rowIndex = 3
// Output: [1,3,3,1]

import java.util.*;
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        long prev = 1;
        for (int i = 1; i <= rowIndex; i++) {
            long next_val = prev * (rowIndex - i + 1) / i;
            res.add((int) next_val);
            prev = next_val;
        }
        return res;
    }
}