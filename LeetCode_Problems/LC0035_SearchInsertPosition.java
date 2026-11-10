/*
 * Problem: 35. Search Insert Position
 *
 * Description:
 * Given a sorted array of distinct integers and a target,
 * return the index if the target exists.
 * Otherwise, return the index where it should be inserted
 * to maintain sorted order.
 *
 * Approach:
 * 1. Apply Binary Search on the sorted array.
 * 2. Initialize low = 0 and high = nums.length - 1.
 * 3. Calculate the middle index.
 * 4. If nums[mid] == target, return mid.
 * 5. If nums[mid] < target, search the right half.
 * 6. Otherwise, search the left half.
 * 7. When the loop ends, return low because it represents
 *    the correct insertion position.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return low;
    }
}
