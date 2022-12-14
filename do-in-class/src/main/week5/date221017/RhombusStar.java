package main.week5.date221017;

public class RhombusStar {
    public void stamp(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = length - i; j > 1; j--) {
                System.out.printf(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        for (int i = length - 1; i > 0; i--) {
            for (int j = length - i; j > 0; j--) {
                System.out.printf(" ");
            }
            for (int k = 0; k < 2 * (i - 1) + 1; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        RhombusStar stamper = new RhombusStar();
        stamper.stamp(4);
    }
}
