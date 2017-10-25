/***
1. Two Sum
Question Link: https://leetcode.com/problems/two-sum/description/
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
***/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        //use HashMap to store
        HashMap<Integer, Integer> resHashMap = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length-1; i++){
            //find target
            int possible_target = target - nums[i];
            
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] == possible_target){
                    resHashMap.put(i,nums[i]);
                    resHashMap.put(j,nums[j]);
                    break;
                }
            }
            //check if there is data in HashMap
            if(resHashMap.size() != 0){
                break;
            }
        }
        
        //convert HashMap to array
        Set<Integer> keys = resHashMap.keySet();
        int[] array = new int[keys.size()];
        int index = 0;
        for(Integer element : keys) array[index++] = element.intValue();
        
        //return result
        return array;
    }
}
