package BinarySearch;

public class KthMissingNumber {
    public static void brute() {
        int[] arr={2,3,5,7,11};
        int k=5;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                k++;
            }
            else{
                break;
            }
        }
        System.out.println("missing number : " +k);
    }

    public static void optimal() {
        int[] arr={2,3,5,7,11};
        int k=5;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        System.out.println("missing number :"+(low+k));//or high+1+k error when high =-1
    }
}
