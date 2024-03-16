/*
 * Copyright (c) 2024. Ranyu Xiong
 * All rights reserved.
 */

public class SelectionSort {
    // 选择排序方法
    public static void selectionSort(int[] arr) {
        // 获取数组长度
        final int length = arr.length;

        // 遍历数组
        for (int i = 0; i < length - 1; i++) {
            // 假设当前索引为最小值的索引
            int minIndex = i;

            // 在未排序部分找到最小元素的索引
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // 将最小元素交换到已排序部分的末尾
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
