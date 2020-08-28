package Aarrrmor;

public class Question2 {

    public static void main(String[] args) {
        String result;
        result = isNumberFibbinary(10) ? "Yes" : "No";
        System.out.println(result);
    }

    public static boolean isNumberFibbinary(int n) {
        String binaryForm = intToBinary(n);
        System.out.println(binaryForm);
        char[] charArray = binaryForm.toCharArray();
        for (int i = 0; i < charArray.length-1; i++) {
            if (charArray[i] == 49) {
                if (charArray[i+1] == 49) {
                    return false;
                }
            }
        }
        return true;
    }

    private static String intToBinary(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 1) {
            binary.append(n % 2);
            n = n / 2;
        }
        return binary.append(n).reverse().toString();
    }
}
