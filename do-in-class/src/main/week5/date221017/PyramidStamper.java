package main.week5.date221017;

public class PyramidStamper implements Stamper{
    private final char letter;
    private final int length;

    public PyramidStamper(char letter, int length) {
        this.letter = letter;
        this.length = length;
    }

    @Override
    public void stamp() {
        for (int i = 0; i < this.length; i++) {
            for (int j = this.length - i; j > 1; j--) {
                System.out.printf(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.printf("%c", this.letter);
            }
            System.out.println();
        }    }
}
