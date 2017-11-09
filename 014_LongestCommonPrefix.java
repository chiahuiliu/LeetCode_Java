/***

14. Longest Common Prefix
Problem link: https://leetcode.com/problems/longest-common-prefix/description/

Desciption.
Write a function to find the longest common prefix string amongst an array of strings.

Solution. (horizontal search)
Make the first one in array as the prefix.
Iterating the elements in array to find the longest prefix

special cases
array is null or array length == 0 ==> return "";
***/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        //null array and empty array
        if(strs == null || strs.length == 0) return "";
        
        //horizontal searching
        String prefix = strs[0];
        int i = 1;
        while(i < strs.length) {         
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.length() == 0) return "";
            }
            i++;
        }
        return prefix;
        
    }
}
