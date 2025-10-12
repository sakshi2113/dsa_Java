package BinarySearch;

public class MinimumInRotatedSortedArr {
    public static void minimum() {
        int[] nums={4,5,6,7,0,1,2};
        int ans=Integer.MAX_VALUE;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            //if search place is not rotated just sorted
            if (nums[low]<=nums[high]){
                ans=Math.min(nums[low],ans);
                break;
            }
            if (nums[low]<=nums[mid]){
                ans=Math.min(ans,nums[low]);
                low=mid+1;
            }
            else{
                ans=Math.min(ans,nums[mid]);
                high=mid-1;
            }

        }
        System.out.println("minimum element of arr :"+ans);
    }
}
