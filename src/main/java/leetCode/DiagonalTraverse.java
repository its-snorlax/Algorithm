//https://leetcode.com/problems/diagonal-traverse/
package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] output = new int[m * n];
        int position = 0;

        HashMap<Integer, List<Integer>> hashmap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (hashmap.containsKey(i + j)) {
                    List<Integer> integers = hashmap.get(i + j);
                    integers.add(matrix[i][j]);
                } else {
                    ArrayList<Integer> integers = new ArrayList<>();
                    integers.add(matrix[i][j]);
                    hashmap.put(i + j, integers);
                }
            }
        }

        for (int i = 0; i <= (m - 1) + (n - 1); i++) {
            List<Integer> integers = hashmap.get(i);
            if (i % 2 != 0) {
                for (Integer integer : integers) output[position++] = integer;
            } else {
                for (int j = integers.size() - 1; j >= 0; j--) {
                    output[position++] = integers.get(j);
                }
            }
        }

        return output;
    }
}
