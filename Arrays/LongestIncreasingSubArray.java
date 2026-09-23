package arrays;

/*
 * Problem: Longest Increasing SubArray
 *
 * Description:
 * Find the longest contiguous subarray in which every element is
 * greater than the previous element.
 *
 * Approach:
 *
 * 1. Initialize max and count with 1 because a single element
 *    itself can be considered an increasing subarray.
 *
 * 2. Initialize f and l to store the starting and ending indexes
 *    of the longest increasing subarray.
 *
 * 3. Initialize start with 0 to keep track of the starting index
 *    of the current increasing subarray.
 *
 * 4. Traverse the array from the second element and compare the
 *    current element with the previous element.
 *
 * 5. If the current element is greater than the previous element,
 *    increment count because the increasing subarray continues.
 *
 * 6. If count becomes greater than max, update max and store the
 *    current subarray's starting and ending indexes in f and l.
 *
 * 7. If the current element is not greater than the previous element,
 *    reset count to 1 and update start with the current index because
 *    a new increasing subarray begins.
 *
 * 8. After traversing the array, max contains the length of the
 *    longest increasing subarray, while f and l contain its
 *    starting and ending indexes.
 *
 * 9. Traverse from f to l to print all the elements of the
 *    longest increasing subarray.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class LongestIncreasingSubArray {

	public static void main(String[] args) {

		int a[] = {2,3,8,4,7,9,11,12,18,22,3,2,7};

		int max = 1;
		int count = 1;

		int f = -1, l = -1;
		int start = 0;

		for(int i = 1; i < a.length; i++) {

			if(a[i - 1] < a[i]) {

				count++;

				if(count > max) {
					max = count;
					f = start;
					l = i;
				}

			} else {

				count = 1;
				start = i;
			}
		}

		System.out.println(max);
		System.out.println(f);
		System.out.println(l);

		for(int i = f; i <= l; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
