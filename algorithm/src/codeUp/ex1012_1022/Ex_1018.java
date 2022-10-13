package codeUp.ex1012_1022;

import java.util.Scanner;

public class Ex_1018 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(":");
        System.out.printf("%s:%s", inputs[0], inputs[1]);
    }
}
