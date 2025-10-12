package BinarySearch;

public class NumberOfTimesArrRotated {
    public static void rotatedTimes() {
    int[] nums={4,5,6,7,0,1,2};
    int ans=Integer.MAX_VALUE;
    int index=-1;
    int low=0;
    int high=nums.length-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        //if search place is not rotated just sorted
        if (nums[low]<=nums[high]){
            if (nums[low]<ans) {
                index=low;
                ans = nums[low];
            }
            break;
        }
        if (nums[low]<=nums[mid]){
            if (nums[low]<ans) {
                index=low;
                ans = nums[low];
            }
            low=mid+1;
        }
        else{
            if (nums[mid]<ans) {
                index=mid;
                ans = nums[mid];
            }
            high=mid-1;
        }

    }
    System.out.println("number of times arr is rotated  :"+index);
}

}
