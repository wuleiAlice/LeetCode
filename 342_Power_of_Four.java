<<<<<<< HEAD

/*
 Author:     Alice, Du Weichao
 Date:       08 Feb 2017
 Problem:    Power of Four
 Difficulty: Easy
 Source:     https://leetcode.com/problems/power-of-four/

=======
/*
 Author:     Alice, Du Weichao
 Date:       06 Feb 2017
 Problem:    Power of Four
 Difficulty: Easy
 Source:     https://leetcode.com/problems/power-of-four/
 Notes:
>>>>>>> origin/master
Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.

<<<<<<< HEAD
*/

=======
Follow up: Could you solve it without loops/recursion?
*/





>>>>>>> origin/master
public class Solution {
    public boolean isPowerOfFour(int num) {
        return (Integer.bitCount(num) == 1 && Integer.numberOfTrailingZeros(num) % 2 == 0);
    }
}