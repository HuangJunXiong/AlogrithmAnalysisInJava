package com.gray;

import java.util.Arrays;

/**
 * Created by lenovo on 2017/2/26.
 */
public class HeapSort {
    public static void main(String args[]) {
        int a[] = {69, 65, 90, 37, 92, 6, 28, 54};
        heapSort(a);
        System.out.println("排序后：" + Arrays.toString(a));
    }

    private static void heapSort(int[] arr) {
        // 建初始堆
        for (int i = arr.length  / 2; i >= 0; i--) {
            sift(arr, i, arr.length);
        }
        for (int i = arr.length-1 ; i > 0; i--) {
            int temp = arr[0]; // 交换位置
            arr[0] = arr[i];
            arr[i] = temp;
            sift(arr, 0, i); // 重新建堆 每次建堆少一个元素
        }
    }

    /**
     * 筛选算法
     *
     * @param arr
     * @param start 开始建堆的位置
     * @param size  剩下节点的容量大小
     */
    private static void sift(int[] arr, int start, int size) {
        int j = 2 * start + 1; //j是i的左孩子的位置
        int temp = arr[start];
        while (j < size) {
            if (j != size-1 && arr[j] < arr[j + 1]) {   //若右孩子大，把j指向右孩子
                j++;
            }
            if (temp < arr[j]) {
                arr[start] = arr[j]; // 将arr[j]交换到双亲节点上，并修改i，j的值，以便继续筛选
                start = j;
                j = 2 * j + 1;
            } else {
                break;
            }
        }
        arr[start] = temp; //被筛选的节点的值放入最终位置
    }
}
