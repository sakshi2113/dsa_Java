package Arrays;

public class FindMissingNumber {
    public static int missingNumber(int[] arr) {
        int sum=0;
        int sumofnp1=0;
        int len=arr.length;
        for (int j=0;j<len+1;j++){
            sumofnp1+=j;
        }
        for (int i=0;i<len;i++){
            sum+=arr[i];
        }
        return sumofnp1-sum;
    }
}
