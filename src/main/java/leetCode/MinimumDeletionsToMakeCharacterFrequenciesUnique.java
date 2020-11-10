//https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/
package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MinimumDeletionsToMakeCharacterFrequenciesUnique {
    public int minDeletions(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!hashMap.containsKey(c)) hashMap.put(c, 1);
            else hashMap.put(c, hashMap.get(c) + 1);
        }
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (Map.Entry<Character, Integer> characterIntegerEntry : hashMap.entrySet()) {
            Integer value = characterIntegerEntry.getValue();
            while (!set.add(value)) {
                if (value > 0) {
                    value--;
                    count++;
                    continue;
                }
                break;
            }
        }
        return count;
    }
}