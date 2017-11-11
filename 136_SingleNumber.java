/***

136. Single Number
Problem Link: https://leetcode.com/problems/single-number/description/

Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

***/

class Solution {
    public int singleNumber(int[] nums) {
        
        int n = 0;
        
        // XOR solution for linear runtime complexity and without using extra memory
        for(int num : nums) {
            n = n ^ num;
        }
        
        return n;
    }
}
