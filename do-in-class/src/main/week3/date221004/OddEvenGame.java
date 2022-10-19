package main.week3.date221004;

import java.util.Scanner;

public class OddEvenGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rocks = scanner.nextInt();

        System.out.println((rocks%2==0) ? "even" : "odd");
    }
}
