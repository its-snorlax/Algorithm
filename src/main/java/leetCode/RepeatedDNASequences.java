//https://leetcode.com/problems/repeated-dna-sequences/submissions/
package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        ArrayList<String> output = new ArrayList<>();
        HashSet<String> subStrings = new HashSet<>();
        int i = 0;
        while (i + 10 <= s.length()) {
            String substring = s.substring(i, i + 10);
            if (!subStrings.contains(substring)) {
                subStrings.add(substring);
            } else {
                if (!output.contains(substring)) output.add(substring);
            }
            i++;
        }
        return output;
    }
}
