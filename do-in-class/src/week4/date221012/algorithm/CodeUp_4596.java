package week4.date221012.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp_4596 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = 0;
        int col = 0;
        int row = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int input = scanner.nextInt();
                if(max<input){max=input; col=j; row=i;}
            }
        }
        System.out.println(max);
        System.out.printf("%d %d", row+1, col+1);
    }
}
