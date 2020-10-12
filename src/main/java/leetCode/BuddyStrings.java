package leetCode;

import java.util.HashSet;

public class BuddyStrings {
    public boolean buddyStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        HashSet<Character> characters = new HashSet<>();
        if (a.equals(b)) {
            for (char c : a.toCharArray()) {
                if (characters.contains(c)) return true;
                characters.add(c);
            }
            return false;
        }
        int first = -1;
        int second = -1;
        for (int i = 0; i < a.length(); i++) {
            char charA = a.charAt(i);
            char charB = b.charAt(i);
            if (charA != charB) {
                if (first == -1) first = i;
                else if (second == -1) second = i;
                else return false;
            }
        }
        if (first != -1 && second != -1) {
            return a.charAt(first) == b.charAt(second) && b.charAt(first) == a.charAt(second);
        }
        return false;
    }

}
