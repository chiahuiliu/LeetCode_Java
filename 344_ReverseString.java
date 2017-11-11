/***

344. Reverse String
Problem link: https://leetcode.com/problems/reverse-string/description/

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

***/

class Solution {
    public String reverseString(String s) {
        
        int left = 0;
        int right = s.length() -1;
        
        char[] sChar = s.toCharArray();
        
        while(left < right) {
            
            /************** Solution 1 ****************/
            // with extra space exchange
            char temp = sChar[left];
            sChar[left] = sChar[right];
            sChar[right] = temp;
            
            left++;
            right--;
                  
             /************** Solution 2 ****************/
            //not using extra space
            sChar[left] = (char) (sChar[left] ^ sChar[right]);
            sChar[right] = (char) (sChar[left] ^ sChar[right]);
            sChar[left] = (char) (sChar[left] ^ sChar[right]);
            
            left++;
            right--;
        }
        
        return new String(sChar);
    }
}
