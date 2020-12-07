//https://leetcode.com/problems/spiral-matrix-ii/
package leetCode;

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int number = 1;
        int[][] output = new int[n][n];
        int square = n * n;
        int top = 0;
        int left = 0;
        int bottom = n - 1;
        int right = n - 1;

        while (number <= square) {
            for (int i = left; i <= right; i++) {
                output[top][i] = number;
                number++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                output[i][right] = number;
                number++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                output[bottom][i] = number;
                number++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                output[i][left] = number;
                number++;
            }
            left++;
        }
        return output;
    }
}
