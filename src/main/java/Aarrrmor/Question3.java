package Aarrrmor;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(findModulo(n, m));
            t--;
        }
    }

    public static int findModulo(int n, int m) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + Math.pow(i, i);
        }
        return (int) sum % m;
    }
}
