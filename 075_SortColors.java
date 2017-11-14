/***
75. SortColors

Problem link: https://leetcode.com/problems/sort-colors/description/

Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, 
with the colors in the order red, white and blue.
Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
Note:
You are not suppose to use the library's sort function for this problem.

***/
// Solution 1.
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

// Soulution 2.
class Solution {
    public void sortColors(int[] nums) {

        if(nums.length == 0) return;
        
        int i = 0;
        int k = nums.length -1;
        for (int j = 0; j <= k; j++) {
            while(nums[j] == 2 && j < k) swap(nums, j, k--);
            while(nums[j] == 0 && j > i) swap(nums, j, i++);
        }
       
    }
    
    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
