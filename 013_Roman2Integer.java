/***

13. Roman to Integer
Problem link: https://leetcode.com/problems/roman-to-integer/description/


Given a roman numeral, convert it to an integer.
Input is guaranteed to be within the range from 1 to 3999.
***/

class Solution {
    public int romanToInt(String s) {
    
        Map<Character, Integer> romanToIntMap = new HashMap<>();
        //correlate roman to integer
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
        
        //convert input String s to char array
        char[] ch_Array = s.toCharArray();
        
        int res = 0;
        for (int i = ch_Array.length - 1; i >= 0; i--) {
            //first char
            if (i == ch_Array.length - 1) {
                res += romanToIntMap.get(ch_Array[i]);
                continue;
            }
            
            if (romanToIntMap.get(ch_Array[i]) >= romanToIntMap.get(ch_Array[i + 1])) {
                res += romanToIntMap.get(ch_Array[i]);
            } else res -= romanToIntMap.get(ch_Array[i]);
        }
        return res;
    }    
}
