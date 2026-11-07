/*
 * Problem: LC0075 - Sort Colors
 *
 * Description:
 * Given an array containing only 0, 1, and 2,
 * sort the array in-place in ascending order
 * without using the built-in sorting function.
 *
 * Approach:
 *
 * 1. Use an outer loop to traverse the array from
 *    the first element to the last element.
 *
 * 2. Use an inner loop starting from the current
 *    outer loop index to compare the remaining elements.
 *
 * 3. If the current inner loop element is smaller
 *    than the outer loop element, swap both elements.
 *
 * 4. Repeat the process until all elements are
 *    arranged in ascending order.
 *
 * Time Complexity: O(n²)
 *
 * Space Complexity: O(1)
 */

class Solution {
    public void sortColors(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                if(nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
