package codeUp.ex1023_1032;

import java.util.Scanner;

public class Ex_1023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split("\\.");
        System.out.println(split[0]);
        System.out.println(split[1]);
    }
}
