// Build Array With Stack Operations
package day19;

// Input: target = [1,3], n = 3
// Output: ["Push","Push","Pop","Push"]
// Explanation: Initially the stack s is empty. The last element is the top of the stack.
// Read 1 from the stream and push it to the stack. s = [1].
// Read 2 from the stream and push it to the stack. s = [1,2].
// Pop the integer on the top of the stack. s = [1].
// Read 3 from the stream and push it to the stack. s = [1,3].


import java.util.*;
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ops = new ArrayList<>();

        int idx = 0;

        for (int num = 1; num <= n && idx < target.length; num++) {

            ops.add("Push");

            if (num == target[idx]) {
                idx++;              // keep it
            } else {
                ops.add("Pop");     // remove it
            }
        }

        return ops;
    }
}