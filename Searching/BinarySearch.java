package searching;

/*
 * Problem: Binary Search
 *
 * Description:
 * Search for a given element in a sorted array using the binary search technique.
 *
 * Approach:
 * 1. Initialize the first index as 0 and the last index as the last
 *    index of the array.
 * 2. Calculate the middle index.
 * 3. Compare the target element with the middle element.
 * 4. If the target is equal to the middle element, print its index.
 * 5. If the target is smaller than the middle element, search in the
 *    left half by updating the last index.
 * 6. If the target is greater than the middle element, search in the
 *    right half by updating the first index.
 * 7. Continue the process until the element is found.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {3,16,25,38,46,59,66,73,82,90};
        int ele = 59;

        int first = 0, last = a.length - 1, mid = (first + last) / 2;

        for(int i = 0; i < a.length; i++) {
            if(ele == a[mid]) {
                System.out.println("Element found at index " + mid);
                break;
            }
            else if(ele < a[mid]) {
                last = mid - 1;
                mid = (first + last) / 2;
            }
            else if(ele > a[mid]) {
                first = mid + 1;
                mid = (first + last) / 2;
            }
        }
    }
}
