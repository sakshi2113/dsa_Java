package Arrays;

public class Largest {
    public static int largest(int[] arr) {
        int lar=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (lar <arr[i]){
                lar=arr[i];
            }
        }
        return lar;
    }


}
