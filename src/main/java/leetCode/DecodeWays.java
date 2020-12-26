//https://leetcode.com/problems/decode-ways/
package leetCode;

public class DecodeWays {

    Integer memo[];

    public int numDecodings(String s) {
        if (s.isEmpty()) return 0;
        memo = new Integer[s.length()];
        return numDecodingsApproach1Helper(0, s);
    }

    public int numDecodingsApproach1Helper(int i, String s) {
        if (i == s.length()) return 1;
        if (s.charAt(i) == '0') return 0;
        if (i == s.length() - 1) return 1;
        if (memo[i] != null) return memo[i];
        int res = numDecodingsApproach1Helper(i + 1, s);

        if (Integer.parseInt(s.substring(i, i + 2)) <= 26) {
            res += numDecodingsApproach1Helper(i + 2, s);
        }
        memo[i] = res;
        return res;
    }
}
