package leetCode;

import java.util.HashMap;

public class MinimumOperationsToReduceXToZero {

    HashMap<String, Integer> map;

    public int minOperations(int[] nums, int x) {
        map = new HashMap<>();
        int ans = helper(nums, x, 0, nums.length - 1, 0);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private int helper(int[] nums, int x, int start, int end, int depth) {
        if (x == 0) return depth;
        if (x < 0 || start > end) return Integer.MAX_VALUE;

        String key = start + "*" + end + "*" + x;
        if (map.containsKey(key)) return map.get(key);

        int left = helper(nums, x - nums[start], start + 1, end, depth + 1);
        int right = helper(nums, x - nums[end], start, end - 1, depth + 1);

        int min = Math.min(left, right);
        map.put(key, min);
        return min;
    }
}
