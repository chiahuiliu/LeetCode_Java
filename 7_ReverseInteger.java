/***

7. Reverse Integer

Problem link: https://leetcode.com/problems/reverse-integer/description/

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:
Input: 123
Output:  321

Example 2:
Input: -123
Output: -321

Example 3:
Input: 120
Output: 21

Note:
Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. 
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

***/

class Solution {
    public int reverse(int x) {
        
        long reverseInt = 0;
        
        while(x != 0) {
            
            //reverse int
            reverseInt = reverseInt*10 + x % 10;
            x = x / 10;
            //overflow exception for upper bound and lower bound
            if (reverseInt > Integer.MAX_VALUE || reverseInt < Integer.MIN_VALUE) return 0;
        }
        
        return (int)reverseInt;
    }
}
