package codeUp.ex1012_1022;

import java.util.Scanner;

public class Ex_1015 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = scanner.nextDouble();
        System.out.printf("%.2f", (double) Math.round(input*100) / 100);
    }
}
