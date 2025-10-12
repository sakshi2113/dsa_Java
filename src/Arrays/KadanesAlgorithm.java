package Arrays;

public class KadanesAlgorithm {
    public static int maxSubArray(int[] arr1) {

        int sum=0;
        int max=Integer.MIN_VALUE;

        int start=0;
        int ansStart=0;
        int ansEnd=0;

        for (int i=0;i<arr1.length;i++){
            if (sum==0){
                start=i;
            }
            sum+=arr1[i];
            if (sum>max){
                max=sum;
                ansStart=start;
                ansEnd=i;
            }
            if (sum<0){
                sum=0;
            }
        }
        System.out.print("sub array ");
        for (int i=ansStart;i<=ansEnd;i++){
            System.out.print( arr1[i]+" ");
        }
        System.out.println();
        return max;

        //optimal solution
//        int cs=arr1[0];
//        int ms=arr1[0];
//        for(int i=1;i<arr1.length;i++){
//             cs=Math.max(arr1[i],cs+arr1[i]);
//             ms=Math.max(cs,ms);
//        }
//        return ms;


        //brute force
        // int cs=0;
        // int ms=Integer.MIN_VALUE;
        // int max_ele=Integer.MIN_VALUE;
        // for(int i=0;i<arr1.length;i++){
        //     if (arr1[i]>max_ele){
        //         max_ele=arr1[i];
        //     }
        // }
        // if (max_ele<=0){
        //     return max_ele;
        // }
        // for(int i=0;i<arr1.length;i++){
        //     cs=cs+arr1[i];
        //     if(cs<0){
        //         cs=0;
        //     }
        //     ms=Math.max(ms,cs);
        // }
        // return ms;
    }
}
