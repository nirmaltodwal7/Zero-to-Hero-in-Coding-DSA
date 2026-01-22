// Maximum Nesting Depth of the Parentheses

package day20;


// Input: s = "(1+(2*3)+((8)/4))+1"

// Output: 3

// Explanation:

// Digit 8 is inside of 3 nested parentheses in the string.



class Solution {
    public int maxDepth(String s) {
        int max = 0, curr = 0;

        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                curr++;
                if(curr>max)
                   max=curr;
            }
            else if(ch==')')
              curr--;
        }
        return max;
    }
}