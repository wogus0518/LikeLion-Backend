package main.week4.date221012.minMax;


public class FindMinMax {

    public int findMax1D(int[] arr) {
        int max = arr[0];
        int idx = 0;

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                idx = i;
            }
        }
        return max;
    }

    public int findMin1D(int[] arr) {
        int min = arr[0];
        int idx = 0;

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                idx = i;
            }
        }
        return min;
    }

    public int findMax2D(int[][] arr) {
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
