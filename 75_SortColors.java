/***
75. SortColors

Problem link: https://leetcode.com/problems/sort-colors/description/

Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
Note:
You are not suppose to use the library's sort function for this problem.

***/

class Solution {
    public void sortColors(int[] nums) {

        for(int i = 0; i < nums.length-1; i++) {
            
            int min_index = i;
            
            for(int j = i+1; j<nums.length; j++){
                if(nums[j] < nums[min_index]){
                    min_index = j;
                }
            }
            
            int min_temp = nums[min_index];
            nums[min_index] = nums[i];
            nums[i] = min_temp;
        }
    }
}
