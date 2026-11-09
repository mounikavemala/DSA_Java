 /*
     * Problem: Pascal's Triangle
     *
     * Description:
     * Given an integer numRows, generate the first numRows
     * of Pascal's Triangle.
     *
     * In Pascal's Triangle, the first and last elements
     * of every row are always 1.
     * Every middle element is calculated by adding the
     * two elements directly above it from the previous row.
     *
     * Approach:
     * 1. Create an outer ArrayList to store all the rows.
     * 2. Iterate from 0 to numRows-1 to generate each row.
     * 3. Create a new ArrayList for every row.
     * 4. Iterate from 0 to i to generate elements in the current row.
     * 5. If j is 0 or j is equal to i, add 1 because
     *    the first and last elements of every row are 1.
     * 6. Otherwise, calculate the current element by adding
     *    the two elements directly above it from the previous row.
     * 7. Add the calculated element to the current row.
     * 8. Add the completed row to the outer ArrayList.
     * 9. Return the outer ArrayList containing Pascal's Triangle.
     *
     * Time Complexity: O(numRows^2)
     * Space Complexity: O(numRows^2)
     */

import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();

        for(int i = 0; i <= numRows-1; i++) {
            List<Integer> mini_list = new ArrayList<>();

            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i)
                    mini_list.add(1);
                else {
                    int sum = l.get(i-1).get(j-1)
                            + l.get(i-1).get(j);
                    mini_list.add(sum);
                }
            }

            l.add(mini_list);
        }

        return l;
    }
}
