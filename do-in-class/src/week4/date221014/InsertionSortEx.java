package week4.date221014;

import java.util.Arrays;

public class InsertionSortEx {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 5, 6, 2, 4};

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];

            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
