/***

20. Valid Parentheses
Problem link: https://leetcode.com/problems/valid-parentheses/description/

Problem Description:
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

Solution:
***Stack***
1. when the char are the left parentheses, push the relevant right one to the stack
2. when the char are the right parentheses, pop the stack & compare with it
3. return to see if the stack is empty
***/

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> parenthesesStk = new Stack<Character>();
        
        for(char ch : s.toCharArray()){
            
            if(ch == '(')
                parenthesesStk.push(')');
            else if(ch == '[')
                parenthesesStk.push(']');
            else if(ch == '{')
                parenthesesStk.push('}');
            else if(parenthesesStk.isEmpty() || parenthesesStk.pop() != ch)
                return false;
        }
        
        return parenthesesStk.isEmpty();
    }
}
