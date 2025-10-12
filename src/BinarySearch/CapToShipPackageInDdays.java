package BinarySearch;

import com.sun.source.tree.BreakTree;

public class CapToShipPackageInDdays {
    public static void shipWithinDays() {
        int[] weights={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        int maxi=weights[0];
        int n=weights.length;
        int sum=0;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,weights[i]);
            sum+=weights[i];
        }
        int low=maxi;
        int high=sum;
        while (low<=high){
            int mid=(low+high)/2;
            int noOfDays=daysRequired(weights,mid);
            if(noOfDays<=days){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        System.out.println("minimum capacity of ship is :"+ low);

    }

    public static int daysRequired(int[] weights,int cap) {
        int days=1;
        int load=0;
        for(int i=0;i<weights.length;i++) {
            if ((load + weights[i]) > cap) {
                days++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return days;
    }
}
