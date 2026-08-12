/*
 * Problem: LeetCode 1 - Two Sum
 *
 * Description:
 * Given an integer array nums and an integer target, return the indices
 * of the two numbers such that they add up to the target.
 *
 * Approach:
 *
 * 1. Traverse the array using an outer loop and select each element.
 *
 * 2. Use an inner loop starting from the next element to compare the
 *    selected element with the remaining elements.
 *
 * 3. Add the two selected elements and store their sum in a variable.
 *
 * 4. If the sum is equal to the target, return the indices of the
 *    two elements.
 *
 * 5. Continue the process until a pair whose sum equals the target
 *    is found.
 *
 * 6. If no such pair is found, return an empty array.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int value = nums[i] + nums[j];
                if(value==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
