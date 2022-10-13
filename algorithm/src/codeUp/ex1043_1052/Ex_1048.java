package codeUp.ex1043_1052;

import java.util.Scanner;

public class Ex_1048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = (int) (a * Math.pow(2,b));
        System.out.println(result);
    }
}
