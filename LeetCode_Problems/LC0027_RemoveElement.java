
class Solution {

    /*
     * Problem: 27. Remove Element
     *
     * Description:
     * Remove all occurrences of a given value from an array in-place.
     * Return the number of elements that are not equal to the given value.
     *
     * Approach:
     * 1. Initialize k = 0 to track the position of valid elements.
     * 2. Traverse the array using a for loop.
     * 3. Check whether nums[i] is not equal to val.
     * 4. If the condition is true:
     *    - Copy nums[i] to nums[k].
     *    - Increment k.
     * 5. Continue until all elements are traversed.
     * 6. Return k as the number of remaining valid elements.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    public int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
