package week5.date221017;

public class RightTrianleStamper implements Stamper{
    private final char letter;
    private final int length;

    public RightTrianleStamper(char letter, int length) {
        this.letter = letter;
        this.length = length;
    }

    @Override
    public void stamp() {
        for (int i = 1; i <= this.length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%c",this.letter);
            }
            System.out.println();
        }    }

    public static void main(String[] args) {
        Stamper stamper = new RightTrianleStamper('*', 4);
        stamper.stamp();
    }


}
