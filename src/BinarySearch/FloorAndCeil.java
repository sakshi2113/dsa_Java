package BinarySearch;

public class FloorAndCeil {
    public static void findFloor() {
        int[] arr={10,20,30,40,50};
        int x=25;
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            //largest number in an arr <= x
            if (arr[mid]<=x){
                ans=arr[mid];
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        System.out.println("floor of"+ x +":"+ ans);
    }

    public static void findCeil() {
        int[] arr={10,20,30,40,50};
        int x=25;
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            //smallest number in an arr >=x
            if (arr[mid]>=x){
                ans=arr[mid];
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        System.out.println("ceil of"+ x +":"+ ans);
    }
}
