import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 9, 3, 7, 2, 6, 4};
//        BubbleSort.bubbleSort(arr);
        SelectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(BinarySearch.binarySearch(arr, 9));
    }
}