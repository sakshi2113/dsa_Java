package Arrays;
import java.util.*;

public class RemoveDuplicateSortedArr {
    public static int removeDuplicates(int[] arr) {
        if (arr.length==0){
            return 0;
        }
        int k=0;
        for (int i=1;i<arr.length;i++){
            if (arr[i]!=arr[i-1]){
                arr[k+1]=arr[i];
                k++;
            }
        }
        return k+1;
    }
}
