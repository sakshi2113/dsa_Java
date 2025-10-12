package BinarySearch;

public class KokoEatingBanana {
    public static void findMinEatingSpeed() {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            maxi = Math.max(maxi, piles[i]);
        }
        int low=1;
        int high=maxi;
        int mid;
        while(low<=high){
            mid=low+(high-low)/2;
            if(totalHours(piles,mid)<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("Minimum eating speed of koko should be "+low);


    }

    public static int totalHours(int[] piles,int hr) {
        int totalHr=0;
        for(int i=0;i<piles.length;i++){
            totalHr+=Math.ceil((double) piles[i]/hr);

        }
        return totalHr;
    }
}
