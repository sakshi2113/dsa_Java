package Arrays;

public class SingleNumber {
    public static int singleNumber(int[] arr1) {
        int xor=0;
        for(int i=0;i<arr1.length;i++){
            xor=xor^arr1[i];
        }
        return xor;
    }
}
