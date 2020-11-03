package leetCode;

public class ConsecutiveCharacters {
    public int maxPower(String s) {
        if (s.length() == 0) return 0;

        int output = 1;
        int currentMax = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                currentMax++;
            } else {
                currentMax = 1;
            }
            output = Math.max(output, currentMax);
        }
        return output;
    }
}