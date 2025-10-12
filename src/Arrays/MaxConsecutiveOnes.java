package Arrays;

public class MaxConsecutiveOnes {
    public static int consOne(int[] arr1) {
        int maxi=0;
        int count=0;
        for (int i=0;i<arr1.length;i++){
            if(arr1[i]==1){
                count++;
                maxi=Math.max(maxi,count);
            }
            else {
                count=0;
            }
        }
        return maxi;
    }
}
