package BinarySearch;

public class FirstAndLastPosition {
    public static void bruteForce( ) {
        int[] arr={1,3,4,5,5,5,6,7,7,8,9};
        int target=8;
        int first=-1;
        int last=-1;
        int[] ans={-1,-1};
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                if (first==-1){
                    first=i;
                }
                last=i;
            }
        }
        ans[0]=first;
        ans[1]=last;
        System.out.println(ans[0] +" , "+ ans[1]);
    }

    public static int first(int[] arr,int target) {
        int n=arr.length;
        int first=-1;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if (arr[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if (arr[mid]<target){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        //System.out.print("first occurance :");
        return first;
    }
    public static int last(int[] arr, int target) {
        int n=arr.length;
        int last=-1;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if (arr[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if (arr[mid]<target){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        //System.out.print("last occurance :");
        return last;
    }

}
