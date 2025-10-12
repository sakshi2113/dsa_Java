package BinarySearch;

public class BSBasics {
    public static boolean bSearch(int[] arr,int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]== key ){
                return true;
            }
            else if (arr[mid]>key){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return false;
    }

    public static int recursiveSearch(int[] arr, int key ,int low ,int high) {

        if (low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if (arr[mid]==key){
            return mid;
        }
        else if (key>arr[mid]){
            return recursiveSearch(arr,key,mid+1,high);
        }
        else{
            return recursiveSearch(arr,key,low,mid-1);
        }

    }

    public static int lowerBound(int[] arr, int x) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }

        //System.out.println("lower bound index: ");
        return ans;
    }

    public static int upperBound(int[] arr, int x) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]>x){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        System.out.println("upper bound index: ");
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,6,8,9,10,13};
        int key=8;

    }

}
