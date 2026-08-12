package sorting;
/*
 * Problem: Bubble Sort
 *
 * Description:
 * Sort the given integer array in ascending order by comparing elements
 * and swapping them when they are in the wrong order.
 *
 * Approach:
 *
 * 1. Initialize an integer array with the given elements.
 *
 * 2. Use an outer loop to traverse each element of the array.
 *
 * 3. Use an inner loop to compare the current element with every other
 *    element in the array.
 *
 * 4. If the current element is greater than the compared element,
 *    swap both elements using a temporary variable.
 *
 * 5. Continue the comparison and swapping process until all elements
 *    are arranged in ascending order.
 *
 * 6. Traverse the sorted array and print all the elements.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */
public class BubbleSort {
	public static void main(String[] args) {
		int a[]= {3,7,5,1,9,4,6,5};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
