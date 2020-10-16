//https://leetcode.com/problems/search-a-2d-matrix/
package leetCode;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        for (int[] row : matrix) {
            if (row[row.length - 1] == target) return true;
            if (row[row.length - 1] > target) {
                int start = 0;
                int end = row.length - 1;
                while (start <= end) {
                    int mid = (start + end) / 2;
                    if (row[mid] == target) return true;
                    if (row[mid] < target) start = mid + 1;
                    if (row[mid] > target) end = mid - 1;
                }
            }
        }
        return false;
    }
}
