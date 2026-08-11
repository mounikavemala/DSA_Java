/*
 * Problem: LeetCode 2996 - Smallest Missing Integer Greater Than Sequential Prefix Sum
 *
 * Description:
 * Given a 0-indexed integer array nums, find the longest sequential prefix
 * of the array and calculate its sum. A sequential prefix is one in which
 * every element is exactly 1 greater than the previous element.
 *
 * Return the smallest integer that is greater than or equal to the sum
 * of the longest sequential prefix and is not present in the array.
 *
 * Approach:
 *
 * 1. Initialize the sum with nums[0] because the sequential prefix
 *    always starts from index 0.
 *
 * 2. Traverse the array from the beginning and check whether the next
 *    element is exactly 1 greater than the current element.
 *
 * 3. If nums[j + 1] is not equal to nums[j] + 1, stop the traversal
 *    because the sequential prefix has ended.
 *
 * 4. If the elements are sequential, add the next element to the sum.
 *
 * 5. Initialize value with the sum of the sequential prefix.
 *
 * 6. Check whether value is present in the array.
 *
 * 7. If value is present, increment value and continue checking.
 *
 * 8. If value is not present in the array, return value as the answer.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        
            for(int j=0;j<nums.length-1;j++){
                if(nums[j+1]!=nums[j]+1){
                    break;
                } else{
                    sum+=nums[j+1];
                }
            }
        int value=sum;
        while(true){
            boolean found=false;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==value){
                    found=true;
                    break;
                }
            }
            if(!found){
                return value;
            }
            value++;
        }
        
    }
}
