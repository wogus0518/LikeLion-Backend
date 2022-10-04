package codeUp.ex1001_1011;

import java.util.Scanner;

/**
 * 1010 : [기초-입출력] 정수 1개 입력받아 그대로 출력하기(설명)

 * 정수형(int)으로 변수를 선언하고, 변수에 정수값을 저장한 후
 * 변수에 저장되어 있는 값을 그대로 출력해보자.
 */

public class Ex_1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(input);
    }
}
