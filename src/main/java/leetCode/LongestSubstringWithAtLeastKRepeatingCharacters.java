//https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/
package leetCode;

public class LongestSubstringWithAtLeastKRepeatingCharacters {
    public int longestSubstring(String s, int k) {
        return longestSubstringUtil(s, 0, s.length(), k);
    }

    int longestSubstringUtil(String s, int start, int end, int k) {
        if (end - start + 1 < k) return 0;
        int[] frequency = new int[26];
        // count frequency;
        for (int i = start; i < end; i++) frequency[s.charAt(i) - 'a']++;

        for (int i = start; i < end; i++) {
            if (frequency[s.charAt(i) - 'a'] < k) {
                return Math.max(longestSubstringUtil(s, start, i, k),
                        longestSubstringUtil(s, i + 1, end, k));
            }
        }
        return (end - start);
    }
}
