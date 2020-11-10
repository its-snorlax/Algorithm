//https://leetcode.com/problems/get-maximum-in-generated-array/
package leetCode;

import java.util.ArrayList;

public class GetMaximumInGeneratedArray {
    public int getMaximumGenerated(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int max = 1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        int i = 1;
        while (list.size() < n + 1) {
            list.add(2 * i, list.get(i));
            if (list.size() < n + 1) {
                int newNum = list.get(i) + list.get(i + 1);
                list.add(2 * i + 1, newNum);
                max = Math.max(max, newNum);
            }
            i++;
        }
        return max;
    }
}
