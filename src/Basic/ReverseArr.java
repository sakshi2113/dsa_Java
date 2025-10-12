package Basic;

public class ReverseArr {
    public static void  reverse(int[] arr, int i) {
        if (i>=arr.length/2){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[arr.length-i-1];
        arr[arr.length-i-1]=temp;
        reverse(arr,i+1);

    }

    public static void print(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        reverse(arr,0);
        print(arr);


    }
}
