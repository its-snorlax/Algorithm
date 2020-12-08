//https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
package leetCode;

public class PairsOfSongsWithTotalDurationsDivisibleBy60 {
    public int numPairsDivisibleBy60(int[] time) {
        int[] temp = new int[60];
        int count = 0;
        for (int i : time) temp[i % 60]++;
        for (int i = 1; i <= 29; i++) count += temp[i] * temp[60 - i];
        count += sumOfN(temp[0] - 1) + sumOfN(temp[30] - 1);
        return count;
    }

    public int sumOfN(int n) {
        return n * (n + 1) / 2;
    }
}
