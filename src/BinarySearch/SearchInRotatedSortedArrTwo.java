package BinarySearch;

public class SearchInRotatedSortedArrTwo {
    public static void search() {
        int[] arr= {3,4,5,1,2,3,3,3};
        int target=3;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==target){
                System.out.println("target found ");
                return;
            }
            if (arr[low]== arr[mid] && arr[mid]==arr[high]){
                low=low+1;
                high=high-1;
                continue;
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
