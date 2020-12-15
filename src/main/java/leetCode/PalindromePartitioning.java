//https://leetcode.com/problems/palindrome-partitioning/
package leetCode;


import java.util.*;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> allPart = new ArrayList<>();
        Deque<String> currPart = new LinkedList<>();
        allSubStringPartition(allPart, currPart, 0, s.length(), s);
        return allPart;
    }

    private static void allSubStringPartition(List<List<String>> allPart,
                                              Deque<String> currPart, int start, int n, String input) {
        if (start >= n) {
            allPart.add(new ArrayList<>(currPart));
            return;
        }
        for (int i = start; i < n; i++) {
            if (isPalindrome(input, start, i)) {
                currPart.addLast(input.substring(start, i + 1));
                allSubStringPartition(allPart, currPart, i + 1, n, input);
                currPart.removeLast();
            }
        }
    }

    private static boolean isPalindrome(String input, int start, int i) {
        while (start < i) {
            if (input.charAt(start++) != input.charAt(i--)) return false;
        }
        return true;
    }
}
