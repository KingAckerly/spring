package com.example.spring.algorithm;

/**
 * 插入排序
 */
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 2, 4};
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
