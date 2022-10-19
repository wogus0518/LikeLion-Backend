package main.week5.date221017;

public class PyramidStar {

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
    }

    public static void main(String[] args) {
        PyramidStar stamper = new PyramidStar();
        stamper.stamp(4);
    }
}
