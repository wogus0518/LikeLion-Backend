package main.week4.date221013.algorithm;

import java.util.Arrays;

public class SelectionSortEx {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        SelectionSortEx selectionSort = new SelectionSortEx();
        int[] sort = selectionSort.sort(arr);
        System.out.println(Arrays.toString(sort));
    }
}
