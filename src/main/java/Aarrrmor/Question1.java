package Aarrrmor;

public class Question1 {

    public static void main(String[] args) {
        String result;
        result = isSubString("Hello", "World") ? "Yes" : "No";
        System.out.println(result);
    }

    public static Boolean isSubString(String str1, String str2) {
        for (char c : str2.toCharArray()) {
            for (char c1 : str1.toCharArray()) {
                if (c1 == c) {
                    return true;
                }
            }
        }
        return false;
    }
}
