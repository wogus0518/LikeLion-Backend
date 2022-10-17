package week5.date221017;

public class RightTriangleStar {
    public void stamp(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RightTriangleStar stamper = new RightTriangleStar();
        stamper.stamp(4);
    }
}
