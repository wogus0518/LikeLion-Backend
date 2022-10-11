package codeUp.ex1043_1052;

import java.util.Scanner;

public class Ex_1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        System.out.println(a+b);
        System.out.println(Math.abs(a-b));
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.printf("%.2f",(float) Math.round(a/(double)b*100)/100);
    }
}
