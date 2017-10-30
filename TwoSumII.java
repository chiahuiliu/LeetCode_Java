/***
167. Two Sum II - Input array is sorted

Problem link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. 
Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2


***/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        /***
        check from both side of the array
        ***/
        int leftPivot = 0;
        int rightPivot = numbers.length -1;
        
        while(leftPivot < rightPivot) {
            
            int sum = numbers[leftPivot] + numbers[rightPivot];
            if(sum == target) return new int[]{leftPivot+1, rightPivot+1};
            if(sum < target)
                leftPivot++;
            else
                rightPivot--;
        }
        
        return new int[]{-1,-1};
        
    }
}
