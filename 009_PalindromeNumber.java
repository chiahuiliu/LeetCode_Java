/***

9. Palindrome Number

Problem link: https://leetcode.com/problems/palindrome-number/description/

Description

Determine whether an integer is a palindrome. Do this without extra space.

Please note.
Negative numbers are not paldrome ones.

time complexity: logN
***/

class Solution {
    public boolean isPalindrome(int x) {

        //noted: the negative numbers are not palindromes
        if(x < 0) return false;
        else if (x == 0) return true;
        else {
            int rev = 0;
            int temp = x;
            while(x != 0) {
                rev = rev * 10 + x % 10;
                x = x / 10;
            }
            
            if(rev == temp) return true;
            else return false;
        }
    }
}
