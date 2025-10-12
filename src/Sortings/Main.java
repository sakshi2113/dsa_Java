package Sortings;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={8,2,0,4,3,5};
//        SelectionSort.sort(arr);
//        BubbleSort.sort(arr);
        InsertionSort.sort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
