package BinarySearch;

public class SplitArray {
    public static void splitArray() {
        int[] arr={10,20,30,40};
        int k=2;
        int low=0;
        int high=0;
        for(int i=0;i<arr.length;i++){
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (countSplit(arr, k, mid) > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Each studens is given "+ low +"pages");

    }

    public static int countSplit(int[] arr ,int k, int mid) {
        int cur=0;
        int count=1;
        for(int i=0;i<arr.length;i++){
            cur+=arr[i];
            if(cur>mid){
                cur=arr[i];
                count++;
//                if(count>k){
//                    return count;
//                }
            }
        }
        return count;
    }
}
