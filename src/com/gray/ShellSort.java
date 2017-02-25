package com.gray;

import java.util.Arrays;

/**
 * Created by lenovo on 2017/2/25.
 */
public class ShellSort {
    public static void main(String args[]) {
        int a[] = {4, 5, 1, 2, 8, 6, 7, 3, 10, 9};
        shellSort(a);
        System.out.println("排序后：" + Arrays.toString(a));
    }

    private static void shellSort(int[] arr) {
        int gap = arr.length / 2;
        while (gap > 0) {
            for (int i = gap; i < arr.length; i++) {
                int temp = arr[i];
                int j = i - gap;
                while (j >= 0 && temp < arr[j]) {
                    arr[j + gap] = arr[j];
                    j = j - gap;
                }
                arr[j + gap] = temp;
                j = j - gap;
            }
            gap = gap / 2;
        }
    }
}
