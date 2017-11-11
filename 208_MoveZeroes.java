/***

208. Move Zeroes
Problem link: https://leetcode.com/problems/move-zeroes/description/

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

***/

class Solution {
    public void moveZeroes(int[] nums) {
        
        // initialize
        int counter = 0, i = 0;
        
        while(i < nums.length) {
            
            // move the non-zero nums forward
            if(nums[i] != 0) {
                nums[counter] = nums[i];
                counter++;
            } 
            i++;
        }
        
        for(int j = counter; j < nums.length; j++) {
            //fill nums with 0
            nums[j] = 0;
        }
            
    }
}
