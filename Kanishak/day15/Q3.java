// Q3. Longest Valid Parentheses

package day15;

class Solution {
    public int longestValidParentheses(String s) {
        // Stack<Integer> stack = new Stack<>();

        int stack[] = new int[s.length()+1];
        int index = -1 ;
        int max = 0;
        stack[++index] = -1;
        // stack.push(-1);
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                // stack.push(i);
                stack[++index] = i;
            } else{
                index--;
                // stack.pop();
                // if(stack.isEmpty())
                if(index==-1) {
                    // stack.push(i);
                    stack[++index] = i;
                } else {
                    // max = Math.max(max, i - stack.peek()); 
                    max = Math.max(max, i - stack[index]);
                }
            }
        }
        return max;
    }
}