//https://leetcode.com/problems/jump-game-iii/
package leetCode;

import java.util.HashSet;

public class JumpGameIII {
    public boolean canReach(int[] arr, int start) {
        return helper(arr, start, new HashSet<>());
    }

    public boolean helper(int[] arr, int start, HashSet<Integer> set) {
        if (start >= 0 && start < arr.length) {
            if (arr[start] == 0) return true;

            if (set.contains(start)) return false;
            else set.add(start);

            if (start == 0) {
                return helper(arr, start + arr[start], set);
            } else if (start == arr.length - 1) {
                return helper(arr, start - arr[start], set);
            } else {
                return helper(arr, start + arr[start], set) || helper(arr, start - arr[start], set);
            }
        }
        return false;
    }
}
