/***

209. Minimum Size Subarray Sum

Problem Link: https://leetcode.com/problems/minimum-size-subarray-sum/description/

Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. 
If there isn't one, return 0 instead.

For example, given the array [2,3,1,2,4,3] and s = 7,
the subarray [4,3] has the minimal length under the problem constraint.

More practice:
If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log n).

***/

// O(n) Solution
/***
Solution:
  1. get left and right pivot separately
  2. while (the sum from array index = left to index = right is smaller than the target s) and (the right pivot is less than the array length)
    ---> move the right pivot to the next
  3. Otherwise, if the sum from that interval is larger or equal than the target s, find the min between (right-left) and the array lengh
    ---> then make the left pivot move to the next, sum shoulf minus the value of left++ as well.
  4. If the final res is still equal than the array length+1 (not found then return 0), else then return res itself.
***/
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        
        int left = 0;
        int right = 0;
        int len = nums.length;
        int sum = 0;
        int res = len + 1;
        
        while(right < len) {
            
            while( sum < s && right < len) {
                sum += nums[right++];
            }
            while(sum>=s){
                res = Math.min(res, right-left);
                sum -= nums[left++];
            }
        }
        
        return res == len+1?0:res;
    }
}
// O(n log n)
/***
Solution: 
1. copy nums to a new array sums[] with +1 length, and assign sums[i] = sums[i-1] + nums[i-1]
2. find the right lower bound where sum > target s
***/

class Solution {
    public int minSubArrayLen(int s, int[] nums) {
      
        int len = nums.length, sums[] = new int[len+1], res = len + 1;
        
        //copy nums to sums
        for(int i = 1; i < len+1; ++i) sums[i] = sums[i-1] + nums[i-1];
        
        for(int i = 0; i < len+1; ++i) {
            int right = searchRight( i+1, len, sums[i]+s, sums);
            if(right == len +1 ) break;
            res = Math.min(res, right-i);
        }
        return res == len+1 ? 0 : res;
    }
    
    int searchRight(int left, int right, int target, int[] arr) {
       
        while(left <= right) {
            int mid = (left+right) / 2;
            if(arr[mid] >= target) right = mid -1;
            else
                left = mid+1;
        }
        return left;
    }
}
