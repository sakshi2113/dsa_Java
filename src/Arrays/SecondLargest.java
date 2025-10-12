package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargest {
    public static int secLargest(ArrayList<Integer> arr) {
        int largest=arr.get(0);
        int sLargest=-1;
        for (int i=0;i<arr.size();i++){
            if (arr.get(i)>largest){
                sLargest=largest;
                largest=arr.get(i);
            }
            else if (arr.get(i)<largest && arr.get(i)>sLargest){
                sLargest=arr.get(i);
            }
        }
        return sLargest;
    }

    public static int secSmallest(ArrayList<Integer> arr){
        int smallest=arr.get(0);
        int sSmallest=Integer.MAX_VALUE;
        for (int i=1;i<arr.size();i++){
            if (arr.get(i)<smallest){
                sSmallest=smallest;
                smallest=arr.get(i);
            }
            else if (arr.get(i)!=smallest && arr.get(i)<sSmallest){
                sSmallest=arr.get(i);
            }
        }
        return sSmallest;
    }
}
