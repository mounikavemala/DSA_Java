package arrays;
/*
 * Problem: Nth Maximum Element in an Array
 *
 * Description:
 * Find the Nth maximum element in an integer array without sorting the array.
 *
 * Approach:
 *
 * 1. Initialize pmax with Integer.MAX_VALUE to set the upper boundary
 *    for finding the maximum element.
 *
 * 2. Run an outer loop n times to find the Nth maximum element.
 *
 * 3. For each iteration, initialize cmax with Integer.MIN_VALUE to
 *    find the largest element smaller than pmax.
 *
 * 4. Traverse the entire array and check whether the current element
 *    is smaller than pmax and greater than cmax.
 *
 * 5. If the condition is satisfied, update cmax with the current element.
 *
 * 6. After traversing the array, assign cmax to pmax so that the next
 *    iteration searches for the next smaller maximum element.
 *
 * 7. After n iterations, pmax contains the Nth maximum element.
 *
 * Time Complexity: O(n × m)
 * Space Complexity: O(1)
 */

public class Nth_Max_Element {
	public static void main(String[] args) {
		int a[]= {3,8,9,6,1,9,4,8,9,7};
		int n=5;
		int pmax=Integer.MAX_VALUE;
		for(int i=1;i<=n;i++) {
			int cmax=Integer.MIN_VALUE;
			for(int j=0;j<a.length;j++) {
				if(a[j]>cmax && a[j]<pmax)
					cmax=a[j];
			}
			pmax=cmax;
		}
		System.out.println(pmax);
	}
}
