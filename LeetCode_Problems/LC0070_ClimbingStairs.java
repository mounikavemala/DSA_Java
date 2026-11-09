/*
 * Problem: Climbing Stairs
 *
 * Description:
 * You are climbing a staircase with n steps.
 * Each time, you can climb either 1 step or 2 steps.
 * Find the total number of distinct ways to reach the top.
 *
 * Approach:
 * 1. If n is 1, return 1 because there is only one way to climb.
 * 2. If n is 2, return 2 because there are two possible ways.
 * 3. Initialize two variables a = 1 and b = 2
 *    to store the number of ways to reach the previous two steps.
 * 4. Iterate from step 3 to n.
 * 5. Calculate the current number of ways by adding
 *    the previous two values (c = a + b).
 * 6. Update a = b and b = c for the next iteration.
 * 7. Return b as the total number of ways to reach the top.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int climbStairs(int n) {
        if(n==1)
        return 1;
        if(n==2)
        return 2;
        int a=1, b=2;
        for(int i=3;i<=n;i++){
            int c= a+b;
            a=b;
            b=c;
        }
        return b;
    }
}
