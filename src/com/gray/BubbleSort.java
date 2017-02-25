package com.gray;

import java.util.Arrays;

/**
 * Created by gray on 2017/2/23.
 */
public class BubbleSort {
    public static void main(String args[]) {
        int a[] = {10, 6, 5, 3, 8, 9, 1, 4, 2, 7};
        function(a);
        System.out.println("排序后：" + Arrays.toString(a));
    }

    public static void function(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
