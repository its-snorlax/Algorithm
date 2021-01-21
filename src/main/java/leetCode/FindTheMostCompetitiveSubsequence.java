//https://leetcode.com/problems/find-the-most-competitive-subsequence/
package leetCode;

import java.util.Stack;

public class FindTheMostCompetitiveSubsequence {
    public int[] mostCompetitive(int[] nums, int k) {
        int noOfDElToBeRemoved = nums.length - k;
        Stack<Integer> st = new Stack<>();
        for (int el : nums) {

            while (!st.empty() && noOfDElToBeRemoved > 0 && st.peek() > el) {
                st.pop();
                noOfDElToBeRemoved--;
            }

            st.push(el);
        }

        while (st.size() > k) {
            st.pop();
        }

        int[] ans = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
//    public int[] mostCompetitive(int[] nums, int k) {
//        if (nums.length == k) return nums;
//        int[] output = new int[k];
//        int lastFindIndex = 0;
//        int edge = nums.length - k;
//        for (int i = 1; i <= k; i++) {
//            int minNumber = Integer.MAX_VALUE;
//            for (int j = lastFindIndex; j <= edge; j++) {
//                if (nums[j] < minNumber) {
//                    minNumber = nums[j];
//                    lastFindIndex = j;
//                }
//            }
//            output[i-1] = minNumber;
//            lastFindIndex++;
//            edge++;
//        }
//        return output;
//    }
}
