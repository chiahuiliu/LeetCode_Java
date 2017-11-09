/***
88. Merge Sorted Array

Problem link: https://leetcode.com/problems/merge-sorted-array/description/

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. 
The number of elements initialized in nums1 and nums2 are m and n respectively.

***/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // initial the size of the elements of num1 and num2
        int nums1Ele = m-1;
        int nums2Ele = n-1;
        
        // total elements for num1+num2
        int totalEle = m+n-1;
        
        //while loop for merging array
        while(nums1Ele >= 0 && nums2Ele >= 0){
            if(nums1[nums1Ele] >= nums2[nums2Ele]){
                nums1[totalEle--] = nums1[nums1Ele--];
            } else 
                nums1[totalEle--] = nums2[nums2Ele--];
        }
        
        //put the remaining elements from num2 to nym1
        while(nums2Ele >= 0){
            nums1[totalEle--] = nums2[nums2Ele--];
        }
    }
}
