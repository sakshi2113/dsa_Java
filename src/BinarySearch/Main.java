package BinarySearch;

import Arrays.Rearrangement;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 5, 5, 6, 7, 7, 8, 9};
        int key = 6;
        int target = 7;

        SearchIn2DMatrixII.brute();
        SearchIn2DMatrixII.optimal();
    }
}
