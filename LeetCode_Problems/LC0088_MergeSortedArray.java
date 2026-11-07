import java.util.Arrays;

/*
 * Problem: LC0088 - Merge Sorted Array
 *
 * Description:
 * Given two sorted integer arrays nums1 and nums2,
 * merge them into a single sorted array.
 *
 * The first array nums1 has enough space to store
 * all elements from both arrays. The final sorted
 * result must be stored inside nums1.
 *
 * Approach:
 *
 * 1. Create a temporary array named result with
 *    a size of m + n to store all elements.
 *
 * 2. Use a loop to copy the first m elements
 *    from nums1 into the result array.
 *
 * 3. Use another loop to copy all n elements
 *    from nums2 into the result array.
 *
 * 4. Use Arrays.sort() to sort the result array
 *    in ascending order.
 *
 * 5. Use a loop to copy all sorted elements
 *    from the result array back into nums1.
 *
 * Time Complexity: O((m + n) log(m + n))
 *
 * Space Complexity: O(m + n)
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int result[] = new int[m + n];

        for(int i = 0, j = 0; i < m; i++) {
            result[j] = nums1[i];
            j++;
        }

        for(int i = 0, j = m; i < n; i++) {
            result[j] = nums2[i];
            j++;
        }

        Arrays.sort(result);

        for(int i = 0, j = 0; i < result.length; i++) {
            nums1[j] = result[i];
            j++;
        }
    }
}
