package Arrays;

import java.sql.SQLOutput;

public class IsSorted {
        public static void check(int[] arr) {
            for (int i=1;i<arr.length;i++){
                if (arr[i]<arr[i-1]){
                    System.out.println("Array is not sorted");
                    return;
                }
            }
            System.out.println("arry is sorted");
        }
}
