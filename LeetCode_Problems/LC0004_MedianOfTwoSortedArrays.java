/*
 * Problem: Median of Two Sorted Arrays
 *
 * Description:
 * Given two sorted arrays nums1 and nums2, find the median of the
 * combined array.
 *
 * Approach:
 * 1. Create a new array with a size equal to the total number of
 *    elements in nums1 and nums2.
 * 2. Copy all elements of nums1 into the new array.
 * 3. Copy all elements of nums2 into the new array.
 * 4. Sort the combined array using nested loops.
 * 5. If the total number of elements is odd, return the middle
 *    element as the median.
 * 6. If the total number of elements is even, find the two middle
 *    elements and return their average as the median.
 *
 * Time Complexity: O((m + n)^2)
 * Space Complexity: O(m + n)
 */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a[]=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            a[i]=nums1[i];
        }
        for(int i=nums1.length,j=0;i<a.length;i++){
            a[i]=nums2[j++];
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        double median=0;
        if(a.length%2!=0){
           int m1=(a.length/2);
           double m=a[m1];
            median=m;
        } else{
            int m1=(a.length/2)-1;
            int m2=(a.length/2);
            double m11=a[m1];
            double m22=a[m2];
            median=(m11+m22)/2;
        }
        return median;
    }
}
