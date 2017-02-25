package com.gray;

import java.util.Arrays;

/**
 * Created by lenovo on 2017/2/25.
 */
public class InsertionSort {
    public static void main(String args[]) {
        int a[] = {4, 5, 1, 2, 8, 6, 7, 3, 10, 9};
        insertionSort(a);
        System.out.println("排序后：" + Arrays.toString(a));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
