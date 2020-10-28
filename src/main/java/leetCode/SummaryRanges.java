//https://leetcode.com/problems/summary-ranges/
package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return Collections.emptyList();
        ArrayList<String> output = new ArrayList<>();
        int start = 0;
        int end = 1;
        while (end < nums.length) {
            if (nums[end] - 1 != nums[end - 1]) {
                if (start == end - 1) output.add(nums[start] + "");
                else output.add(nums[start] + "->" + nums[end - 1]);
                start = end;
                end = end + 1;
            } else {
                end++;
            }
        }
        if (start == end - 1) output.add(nums[start] + "");
        else output.add(nums[start] + "->" + nums[end - 1]);
        return output;
    }
}
