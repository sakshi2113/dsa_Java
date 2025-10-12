package BinarySearch;

public class SearchInsertPosition {
    public static void searchInsert() {
        int[] arr={1,3,5,6,7,8};
        int x=4;
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
        System.out.println("index position : "+ans);

    }
}
