//https://leetcode.com/problems/squares-of-a-sorted-array/
package leetCode;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(operand -> operand * operand).sorted().toArray();
    }
}
