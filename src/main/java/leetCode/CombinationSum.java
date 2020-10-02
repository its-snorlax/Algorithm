package leetCode;
/*
  https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3481/
 */

import java.util.ArrayList;
import java.util.List;


public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> out = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return out;
        }
        List<Integer> combi = new ArrayList<>();
        findCombinations(out, combi, candidates, target, 0);
        return out;
    }

    private void findCombinations(List<List<Integer>> out, List<Integer> combination, int[] candidates, int target, int startIndex) {
        if (target == 0) {
            out.add(new ArrayList<>(combination));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            if (candidates[i] > target) break;
            combination.add(candidates[i]);
            findCombinations(out, combination, candidates, target - candidates[i], i);
            combination.remove(combination.size() - 1);
        }
    }
}
