package week5.date221018;

public class PrintSquare {
    public void print(int length) {
        for (int i = 0; i < length; i++) {
            if (i == 0 || i == length - 1) {
                System.out.printf("*".repeat(length));
            } else {
                System.out.printf("*");
                System.out.printf(" ".repeat(length-2));
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintSquare printer = new PrintSquare();
        printer.print(5);
    }
}
