package sap;

public class DeletingSubStrings {
    public int maxMoves(String s, String t) {
        String reverse = reverse(s);
        int i = countFrequency(s, t);
        int i1 = countFrequency(reverse, t);
        return Math.max(i, i1);
    }

    private int countFrequency(String s, String t) {
        int res = 0;
        while (s.contains(t)) {
            int n = s.length();
            int m = t.length();
            for (int i = 0; i <= n - m; i++) {
                int j;
                for (j = 0; j < m; j++) {
                    if (s.charAt(i + j) != t.charAt(j)) {
                        break;
                    }
                }
                if (j == m) {
                    res++;
                }
            }
            s = s.replace(t, "");
        }
        return res;
    }

    private String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}
