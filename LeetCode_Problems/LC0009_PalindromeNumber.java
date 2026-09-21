/*
 * Problem: LeetCode 9 - Palindrome Number
 *
 * Description:
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * Approach:
 * 1. Store the original value of x in a temporary variable.
 * 2. If x is negative, return false because a negative number cannot be a palindrome.
 * 3. Reverse the digits of the number by extracting the last digit using % 10
 *    and adding it to the reversed number.
 * 4. Remove the last digit from the temporary number using / 10.
 * 5. Compare the reversed number with the original number.
 * 6. If both are equal, return true; otherwise, return false.
 *
 * Time Complexity: O(log₁₀(x))
 * Space Complexity: O(1)
 */

class Solution {

    public boolean isPalindrome(int x) {

        long rev = 0;
        int temp = x;

        if (temp < 0) {
            return false;
        }

        while (temp != 0) {

            int r = temp % 10;
            rev = rev * 10 + r;
            temp /= 10;
        }

        if (x == rev) {
            return true;
        } else {
            return false;
        }
    }
}
