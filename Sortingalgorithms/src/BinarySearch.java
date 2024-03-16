/*
 * Copyright (c) 2024. Ranyu Xiong
 * All rights reserved.
 */

public class BinarySearch {
    // 二分搜索方法
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        // 当左边界小于等于右边界时，进行搜索
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // 如果找到目标元素，返回其索引
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                // 如果目标元素大于中间元素，则在右半部分继续搜索
                left = mid + 1;
            } else {
                // 如果目标元素小于中间元素，则在左半部分继续搜索
                right = mid - 1;
            }
        }

        // 目标元素不在数组中
        return -1;
    }
}
