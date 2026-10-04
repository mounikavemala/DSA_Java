package arrayss;

/*
 * Problem: Maximum Sum Subarray
 *
 * Description:
 * Find the contiguous subarray with the maximum sum
 * in a given integer array. Also, print the starting
 * index, ending index, and elements of that subarray.
 *
 * Approach:
 *
 * 1. Initialize max with 0 to store the maximum
 *    subarray sum. Initialize f and l with -1 to
 *    store the starting and ending indices.
 *
 * 2. Use two nested loops to generate all possible
 *    contiguous subarrays.
 *
 * 3. Initialize sum with 0 for every starting index.
 *    Add each consecutive element to sum in the
 *    inner loop.
 *
 * 4. If the current sum is greater than max, update
 *    max with the current sum and store the current
 *    starting and ending indices in f and l.
 *
 * 5. Print the maximum sum, starting index, and
 *    ending index.
 *
 * 6. Use the stored indices to print the elements
 *    of the maximum sum subarray.
 *
 * Time Complexity: O(n^2)
 *
 * Space Complexity: O(1)
 */

public class Max_Sum_SubArray {
    public static void main(String[] args) {
        int a[] = {3, -7, 8, 4, -3, 6, 8, -4, 2};
        int f = -1, l = -1;
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (sum > max) {
                    max = sum;
                    f = i;
                    l = j;
                }
            }
        }

        System.out.println("Max:" + max);
        System.out.println("F:" + f);
        System.out.println("L:" + l);

        for (int i = f; i <= l; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
