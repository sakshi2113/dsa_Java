package BinarySearch;

public class SmallestDivisorOfThreshold {
    public static void brute() {
        int[] arr={1,2,5,9};
        int threshold=7;
        int maxi=arr[0];
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        for(int d=1;d<=maxi;d++){
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=Math.ceil((double) arr[i]/d);
            }
            if(sum<=threshold){
                System.out.println("smallest divisor is "+d);
                return;
            }
        }
        System.out.println("no smallest divisor possible");
    }

    public static void optimal() {
        int[] arr={1,2,5,9};
        int threshold=7;
        int maxi=arr[0];
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        int low=1;
        int high=maxi;
        while(low<=high){
            int mid=(low+high)/2;
            if(sumOfD(arr,mid)<=threshold){
                high=mid-1;
            }
            else {
                low=mid+1;
            }

        }
        System.out.println("smallest divisor possible is : "+low);


    }

    public static int sumOfD(int[] arr, int divisor) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil((double) arr[i]/(double) divisor);
        }
        return sum;
    }
}
