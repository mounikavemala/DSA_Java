
import java.util.*;

class Solution {

    /*
     * Problem: 15. 3Sum
     *
     * Description:
     * Find all unique triplets in the array whose sum is equal to zero.
     * Duplicate triplets are not allowed.
     *
     * Approach:
     * 1. Sort the given array.
     * 2. Iterate through the array using a for loop.
     * 3. Skip duplicate first elements to avoid duplicate triplets.
     * 4. Initialize two pointers:
     *    - j = i + 1
     *    - k = nums.length - 1
     * 5. Calculate the sum of nums[i], nums[j], and nums[k].
     * 6. If sum == 0:
     *    - Add the triplet to the result.
     *    - Move both pointers.
     *    - Skip duplicate second and third elements.
     * 7. If sum < 0, move j forward.
     * 8. If sum > 0, move k backward.
     * 9. Return the result containing unique triplets.
     *
     * Time Complexity: O(n^2)
     * Space Complexity: O(log n) auxiliary space for sorting,
     *                   excluding the output list.
     */

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {

                    result.add(Arrays.asList(
                        nums[i], nums[j], nums[k]
                    ));

                    j++;
                    k--;

                    // Skip duplicate second elements
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // Skip duplicate third elements
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }

                }
                else if (sum < 0) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }

        return result;
    }
}
