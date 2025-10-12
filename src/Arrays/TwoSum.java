package Arrays;

public class TwoSum {
    public static int[] twoSum(int[] arr1, int target) {
        int lp=0;
        int rp=arr1.length-1;
        while(lp<rp){
            int sum=arr1[lp]+arr1[rp];
            if (sum==target){
                return new int[] {lp,rp};
            }
            if(sum<target){
                lp++;
            }
            else {
                rp--;
            }
        }
        return new int[]{-1,-1};
    }
}
