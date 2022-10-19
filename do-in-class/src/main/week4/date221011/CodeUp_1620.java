package main.week4.date221011;

import java.util.Scanner;

public class CodeUp_1620 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while (input>=10) {
            input = sum(input);
        }
        System.out.println(input);
    }
    public static int sum(int n) {
        int result = 0;
        while (n > 0) {
            result += n%10;
            n /= 10;
        }
        return result;
    }
}
