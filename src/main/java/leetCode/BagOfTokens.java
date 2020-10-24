package leetCode;

import java.util.Arrays;

public class BagOfTokens {
    public int bagOfTokensScore(int[] tokens, int p) {
        Arrays.sort(tokens);
        int score = 0;
        int maxScore = 0;
        int i = 0;
        int j = tokens.length - 1;

        while (i <= j) {
            if (p >= tokens[i]) {
                score++;
                p = p - tokens[i];
                i++;
                maxScore = Math.max(score, maxScore);
            } else if (score > 0) {
                score--;
                p = p + tokens[j];
                j--;
            } else {
                return maxScore;
            }
        }
        return maxScore;
    }
}
