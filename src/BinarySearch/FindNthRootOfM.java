package BinarySearch;

public class FindNthRootOfM {
    public static void root() {
        int m=81;
        int n=4;
        int low=1;
        int high=m;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(pow(mid,n)==m){
                System.out.println(mid);
                return;
            }
            else if(pow(mid,n)>m){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        System.out.println(-1);
    }

    public static long pow(int b,int exp) {//b^exp
        long ans = 1;
        for (int i = 0; i < exp; i++){
            ans = ans * b;
        }
        return ans;
    }
}
