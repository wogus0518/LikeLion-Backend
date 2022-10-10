package codeUp.ex1023_1032;

import java.util.Scanner;

public class Ex_1029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v = scanner.nextDouble();
        v = Math.round(v * Math.pow(10, 11)) / Math.pow(10, 11);
        System.out.printf("%.11f", v);
    }
}
