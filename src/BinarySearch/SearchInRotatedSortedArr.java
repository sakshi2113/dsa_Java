package BinarySearch;

public class SearchInRotatedSortedArr {
    public static void search() {
        int[] arr= {7,8,9,1,2,3,4,5,6};
        int target=9;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==target){
                System.out.println("target fount at index :"+mid);
                return;
            }
            //left sorted
            if (arr[low]<=arr[mid]){
                if (arr[low]<=target && target<=arr[mid]){
                    high=mid-1;
                }
                else
                    low=mid+1;
            }
            // right sorted
            else{
                if (arr[mid]<=target && target <=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        System.out.println("target not found ");
    }
}
