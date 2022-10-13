package codeUp.ex1012_1022;

import java.util.Scanner;

public class Ex_1019 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split("[.]"); //.split(".")
        System.out.printf("%04d.%02d.%02d", Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2]));
    }
}
