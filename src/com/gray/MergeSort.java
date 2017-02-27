package com.gray;

import java.util.Arrays;

/**
 * Created by lenovo on 2017/2/27.
 */
public class MergeSort {
    public static void main(String args[]) {
        int a[] = {3, 6, 1, 7, 9, 4, 5, 8, 2};
        mergeSort(a);
        System.out.println("排序后：" + Arrays.toString(a));
    }

    private static void mergeSort(int[] arr) {
        mergeSort(arr, new int[arr.length], 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(arr, temp, left, center); // 左边
            mergeSort(arr, temp, center + 1, right); // 右边
            merge(arr, temp, left, center + 1, right); // 合并两个有序
        }
    }

    /**
     * 将两个有序表归并成一个有序表
     *
     * @param arr
     * @param temp     临时数组
     * @param leftPos  左边开始下标
     * @param rightPos 右边开始下标
     * @param rightEnd 右边结束下标
     */
    private static void merge(int[] arr, int[] temp, int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1; // 左边结束下标
        int tempPos = leftPos; // 从左边开始算
        int numEle = rightEnd - leftPos + 1; // 元素个数
        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            if (arr[leftPos] <= arr[rightPos])
                temp[tempPos++] = arr[leftPos++];
            else
                temp[tempPos++] = arr[rightPos++];
        }
        while (leftPos <= leftEnd) {  // 左边如果有剩余
            temp[tempPos++] = arr[leftPos++];
        }
        while (rightPos <= rightEnd) { // 右边如果有剩余
            temp[tempPos++] = arr[rightPos++];
        }
        // 将temp复制到arr
        for (int i = 0; i < numEle; i++) {
            arr[rightEnd] = temp[rightEnd];
            rightEnd--;
        }
    }
}
