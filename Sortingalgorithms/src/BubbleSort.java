/*
 * Copyright (c) 2024. Ranyu Xiong
 * All rights reserved.
 */

public class BubbleSort {
    // 冒泡排序方法
    public static void bubbleSort(int[] arr) {
        // 获取数组长度
        final int length = arr.length;

        // 标记是否发生了交换
        boolean swapped;

        // 外部循环控制排序轮数
        for (int i = 0; i < length - 1; i++) {
            swapped = false; // 每轮开始时，假设没有交换发生

            // 内部循环执行一轮比较并交换
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换 arr[j] 和 arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // 标记发生了交换
                }
            }

            // 如果一轮比较中没有发生交换，说明数组已经有序，提前结束排序
            if (!swapped) {
                break;
            }
        }
    }
}
