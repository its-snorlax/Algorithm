//https://leetcode.com/problems/unique-morse-code-words/
package leetCode;

import java.util.HashSet;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<>();
        String[] morseCode = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        for (String word : words) {
            StringBuilder stringBuilder = new StringBuilder();
            char[] chars = word.toCharArray();
            for (char aChar : chars) {
                stringBuilder.append(morseCode[aChar - 97]);
            }
            set.add(stringBuilder.toString());
        }
        return set.size();
    }
}
