package codeUp.ex1023_1032;

import java.util.Scanner;

public class Ex_1024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            System.out.println("'" + s.charAt(i) + "'");
        }
    }
}
