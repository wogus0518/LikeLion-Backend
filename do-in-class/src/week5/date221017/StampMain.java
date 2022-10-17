package week5.date221017;

public class StampMain {
    public static void main(String[] args) {
        System.out.println("직각삼각형으로 출력하기");
        Stamper rightTrianleStamper = new RightTrianleStamper('@', 5);
        rightTrianleStamper.stamp();

        System.out.println();
        System.out.println("피라미드로 출력하기");
        Stamper pyramidStamper = new PyramidStamper('$', 4);
        pyramidStamper.stamp();

    }
}
