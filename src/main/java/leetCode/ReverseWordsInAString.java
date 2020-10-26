package leetCode;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) stringBuilder.append(words[i]).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
