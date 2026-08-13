/*
 * Problem: Reverse Integer
 *
 * Description:
 * Given a signed 32-bit integer, reverse its digits and return the
 * reversed integer. If the reversed integer goes outside the signed
 * 32-bit integer range, return 0.
 *
 * Approach:
 * 1. Initialize a variable rev to store the reversed number.
 * 2. Extract the last digit of x using the modulo operator.
 * 3. Add the extracted digit to rev by multiplying rev by 10.
 * 4. Remove the last digit from x using integer division by 10.
 * 5. Repeat the process until all digits of x are processed.
 * 6. Check whether the reversed number is within the signed 32-bit
 *    integer range.
 * 7. If the reversed number is outside the range, return 0.
 * 8. Otherwise, return the reversed number as an integer.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0){
            int r=x%10;
            rev=rev*10+r;
            x/=10;
        }
        if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE){
            return 0;
        }
        return (int) rev;
    }
}
