//https://leetcode.com/problems/4sum-ii/
package leetCode;

import java.util.HashMap;

public class FourSumII {
    public int fourSumCount(int[] a, int[] b, int[] c, int[] d) {
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int j : a) {
            for (int k : b) {
                int sum = j + k;
                if (!hashMap.containsKey(sum)) hashMap.put(sum, 1);
                else hashMap.put(sum, hashMap.get(sum) + 1);
            }
        }
        for (int j : c) {
            for (int k : d) {
                int sum = (j + k) * -1;
                if (hashMap.containsKey(sum)) count += hashMap.get(sum);
            }
        }
        return count;
    }
}
