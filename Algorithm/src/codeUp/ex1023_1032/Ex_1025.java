package codeUp.ex1023_1032;

import java.util.Scanner;

public class Ex_1025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int loop = 4;

        for (int i = 0; i < 5; i++) {
            int par = (int) Math.pow(10, loop - i);
            int result = input/par * par;
            System.out.println("[" + result + "]");
            input = input - result;
        }
    }
}
