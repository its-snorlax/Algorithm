//https://leetcode.com/problems/132-pattern/
package leetCode;

import java.util.Stack;

public class OneThreeTwoPattern {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] minVal = new int[nums.length];
        minVal[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            minVal[i] = Math.min(nums[i], minVal[i - 1]);
        }
        for (int j = nums.length - 1; j > 0; j--) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[j]) {
                if (minVal[j - 1] < nums[stack.peek()]) {
                    return true;
                }
                stack.pop();
            }
            stack.push(j);
        }
        return false;
    }
}
