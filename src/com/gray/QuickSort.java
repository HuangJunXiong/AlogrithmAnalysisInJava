package com.gray;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by lenovo on 2017/2/24.
 */
public class QuickSort {
    public static void main(String args[]) {
        int a[] = {6, 10, 5, 3, 8, 9, 1, 4, 2, 7};
        function(a);
//        function1(a);
        System.out.println("排序后：" + Arrays.toString(a));
    }

    private static void function1(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        stack.push(arr.length - 1);
        while (!stack.empty()) {
            int j = stack.pop();
            int i = stack.pop();
            if (i < j) {
                int k = quickSortNoRec(arr, i, j);
                if (i < k - 1) {
                    stack.push(i);
                    stack.push(k - 1);
                }
                if (j > k + 1) {
                    stack.push(k + 1);
                    stack.push(j);
                }
            }
        }
    }

    private static int quickSortNoRec(int[] arr, int s, int t) {
        int i = s;
        int j = t;
        int temp;
        if (s < t) {
            temp = arr[s];
            while (i != j) {
                while (j > i && arr[j] > temp)
                    j--;
                arr[i] = arr[j];
                while (i < j && arr[i] < temp)
                    i++;
                arr[j] = arr[i];
            }
            arr[i] = temp;
        }
        return i;
    }

    public static void function(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int s, int t) {
        int i = s;
        int j = t;
        int temp;
        if (s < t) {
            temp = arr[s];
            while (i != j) {
                while (j > i && arr[j] > temp)
                    j--;
                arr[i] = arr[j];
                while (i < j && arr[i] < temp)
                    i++;
                arr[j] = arr[i];
            }
            arr[i] = temp;
            quickSort(arr, s, i - 1);
            quickSort(arr, i + 1, t);
        }
    }
}
