package BinarySearch;

public class FindSqrtOfNumber {
    public static void bruteForce() {
        int n=36;
        int ans=1;
        for (int i=1;i<=n;i++){
            if (i*i<=n){
                ans=i;
            }
            else {
                break;
            }
        }
        System.out.println("square root of "+n+" is : "+ans);
    }

    public static void better() {
        int n=36;
        int ans=1;
        int low=1;
        int high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if (mid*mid<=n){
                ans=mid;
                low=mid +1;
            }
            else {
                high=mid-1;
            }
        }
        System.out.println("square root of "+n+" is : "+ans);
    }

}
