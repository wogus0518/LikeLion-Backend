package codeUp.ex1043_1052;

import java.util.Scanner;

public class Ex_1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a+b+c);
        System.out.printf("%.1f",(float)Math.round((a+b+c)/3.0 *10)/10);
    }
}
