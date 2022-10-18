package week5.date221018;

public class PrintRectangle {
    public void print(int width, int height) {
        for (int i = 0; i < width; i++) {
            System.out.printf("*");
        }
        System.out.println();
        for (int i = 0; i < height - 2; i++) {
            System.out.printf("*");
            for (int j = 0; j < width - 2; j++) {
                System.out.printf(" ");
            }
            System.out.printf("*\n");
        }
        for (int i = 0; i < width; i++) {
            System.out.printf("*");
        }
    }

    public static void main(String[] args) {
        PrintRectangle printer = new PrintRectangle();
        printer.print(3, 4);
    }
}
