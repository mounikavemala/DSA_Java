```java
/*
 * Problem: LeetCode 34 - Find First and Last Position of Element in Sorted Array
 *
 * Description:
 * Given a sorted array of integers, find the starting and ending position
 * of a given target value.
 *
 * If the target is not found, return [-1, -1].
 *
 * The algorithm must have O(log n) runtime complexity.
 *
 * Approach:
 * 1. Use Binary Search to find the first occurrence of the target.
 * 2. When the target is found, store its index and continue searching
 *    on the left side to find an earlier occurrence.
 * 3. Use Binary Search again to find the last occurrence of the target.
 * 4. When the target is found, store its index and continue searching
 *    on the right side to find a later occurrence.
 * 5. Return the array containing the first and last positions.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] a = {-1, -1};

        // Find first occurrence
        int f = 0;
        int l = nums.length - 1;

        while (f <= l) {

            int mid = (f + l) / 2;

            if (target == nums[mid]) {
                a[0] = mid;
                l = mid - 1;
            }
            else if (target < nums[mid]) {
                l = mid - 1;
            }
            else {
                f = mid + 1;
            }
        }

        // Find last occurrence
        f = 0;
        l = nums.length - 1;

        while (f <= l) {

            int mid = (f + l) / 2;

            if (target == nums[mid]) {
                a[1] = mid;
                f = mid + 1;
            }
            else if (target < nums[mid]) {
                l = mid - 1;
            }
            else {
                f = mid + 1;
            }
        }

        return a;
    }
}
