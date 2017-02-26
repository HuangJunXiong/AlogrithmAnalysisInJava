package com.gray;

import java.util.Arrays;

/**
 * Created by lenovo on 2017/2/26.
 */
public class SelectionSort {
    public static void main(String args[]) {
        int a[] = {10, 6, 5, 3, 8, 9, 1, 4, 2, 7};
        selectionSort(a);
        System.out.println("排序后：" + Arrays.toString(a));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int k = i; // 记录最小值的位置
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            if (k != i) {  // 交换
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
    }
}
