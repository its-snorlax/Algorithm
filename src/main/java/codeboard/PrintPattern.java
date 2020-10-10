package codeboard;

public class PrintPattern {
    public static void main(String[] args) {
        printPattern(16, 16);
        System.out.println();
        printPattern(15, 15);
    }

    private static void printPattern(int real, int current) {
        System.out.print(current + " ");
        if (current > 0) printPattern(real, current - 5);
        if (current != real) System.out.print(current + 5 + " ");
    }
}
