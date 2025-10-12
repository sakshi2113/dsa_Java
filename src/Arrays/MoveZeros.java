package Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] arr) {
        int ptr=-1;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==0){
                ptr=i;
                break;
            }
        }
        // if no zero is found, just return
        if (ptr == -1) return;

        for(int i=ptr+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[ptr];
                arr[ptr]=temp;
                ptr++;
            }
        }
    }
}
