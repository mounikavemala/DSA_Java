
class Solution {

    /*
     * Problem: 26. Remove Duplicates from Sorted Array
     *
     * Description:
     * Remove duplicates from a sorted array in-place.
     * Each unique element should appear only once.
     * Return the number of unique elements.
     *
     * Approach:
     * 1. Initialize j = 0 to track the position of unique elements.
     * 2. Iterate through the array starting from index 1.
     * 3. Compare nums[i] with nums[j].
     * 4. If both elements are different:
     *    - Increment j.
     *    - Place nums[i] at nums[j].
     * 5. Continue until the entire array is traversed.
     * 6. Return j + 1 as the number of unique elements.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    public int removeDuplicates(int[] nums) {

        int j = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j + 1;
    }
}
