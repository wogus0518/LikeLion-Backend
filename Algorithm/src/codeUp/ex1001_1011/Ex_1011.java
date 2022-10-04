package codeUp.ex1001_1011;

import java.util.Scanner;

/**
 * 1011 : [기초-입출력] 문자 1개 입력받아 그대로 출력하기(설명) 해결

 * 문자형(char)으로 변수를 하나 선언하고, 변수에 문자를 저장한 후
 * 변수에 저장되어 있는 문자를 그대로 출력해보자.
 */
public class Ex_1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        System.out.println(input);
    }
}
