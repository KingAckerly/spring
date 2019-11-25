package com.example.spring.algorithm;

/**
 * 选择排序
 */
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 2, 4};
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
