//https://leetcode.com/problems/count-sorted-vowel-strings/
package leetCode;

public class CountSortedVowelStrings {
    public int countVowelStrings(int n) {
        if (n==1) return 5;
        int[] counts = {1, 1, 1, 1, 1};
        int sum = 0;
        while (n > 1) {
            for (int i = counts.length - 2; i > -1; i--) {
                counts[i] = counts[i] + counts[i + 1];
                if (n==2) sum = sum + counts[i];
            }
            n--;
        }
        return sum+1;
    }
}
