/*
 * Problem: 3693. Climbing Stairs II
 *
 * Description:
 * You are climbing a staircase with n + 1 steps, numbered from 0 to n.
 * From each step, you can jump 1, 2, or 3 steps.
 * The cost of jumping from step i to step j is:
 * costs[j] + (j - i) * (j - i)
 *
 * Return the minimum total cost to reach step n.
 *
 * Approach:
 * 1. Use Dynamic Programming to calculate the minimum cost
 *    required to reach each step.
 * 2. Create an array dp of size n + 1.
 * 3. Initialize dp[0] = 0 because the starting step has no cost.
 * 4. For every step, check the previous 1, 2, and 3 steps.
 * 5. Calculate the cost of each possible jump and update
 *    the minimum cost using Math.min().
 * 6. Return dp[n].
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int climbStairs(int n, int[] costs) {
        int a[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            a[0] = 0;
            a[i] = Integer.MAX_VALUE;

            for (int j = 1; j <= 3; j++) {
                if (i - j >= 0) {
                    int currentCost =
                        a[i - j] + costs[i - 1] + j * j;

                    a[i] = Math.min(a[i], currentCost);
                }
            }
        }

        return a[n];
    }
}
