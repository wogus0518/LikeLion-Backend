package codeUp.ex1023_1032;

import java.util.Scanner;

public class Ex_1027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\.");
        System.out.printf("%s-%s-%s",strings[2], strings[1], strings[0]);
    }
}
