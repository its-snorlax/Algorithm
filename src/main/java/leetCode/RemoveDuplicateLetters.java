package leetCode;

public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        StringBuilder output = new StringBuilder();
        int[] count = new int[26];
        boolean[] present = new boolean[26];
        for (char c : s.toCharArray()) count[c - 'a']++;

        for (char c : s.toCharArray()) {
            count[c - 'a']--;
            if (present[c - 'a']) {
                continue;
            }
            while (output.length() > 0 && output.charAt(output.length() - 1) > c && count[output.charAt(output.length() - 1) - 'a'] > 0) {
                present[output.charAt(output.length() - 1) - 'a'] = false;
                output.deleteCharAt(output.length() - 1);
            }
            present[c - 'a'] = true;
            output.append(c);
        }
        return output.toString();
    }
}
