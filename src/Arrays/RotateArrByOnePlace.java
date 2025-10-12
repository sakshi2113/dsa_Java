package Arrays;

import java.util.ArrayList;

public class RotateArrByOnePlace {
    public static void rotate(ArrayList<Integer> arr) {
        int temp =arr.get(0);
        for (int j=1;j<arr.size();j++){
                arr.set(j-1,arr.get(j));
        }
        arr.set(arr.size()-1,temp);
    }
    public static void rotateByK(int[] arr, int k) {
        int n=arr.length;
        k=k%n;
        int[] temp =new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for (int j=k;j<n;j++){
            arr[j-k]=arr[j];
        }
        int d=0;
        for (int i=n-k;i<n;i++){
            arr[i]=temp[d];
            d++;
        }
    }
}
