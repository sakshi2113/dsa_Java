package BinarySearch;

public class SingleNonDuplicateInSortedArr {
    public static void brute() {
        int[] nums = {1, 1, 2, 2, 4, 4, 6, 6, 7, 8, 8};
        int n = nums.length;
        if (n==1){
            System.out.println("Single element is: " + nums[0]);

        }

        for (int i = 0; i < n; i++) {
            if (i == 0) { // first element
                if (nums[i] != nums[i + 1]) {
                    System.out.println("Single element is: " + nums[i]);
                    return;
                }
            }
            else if (i == n - 1) { // last element
                if (nums[i] != nums[i - 1]) {
                    System.out.println("Single element is: " + nums[i]);
                    return;
                }
            }
            else { // middle elements
                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                    System.out.println("Single element is: " + nums[i]);
                    return;
                }
            }
        }
        System.out.println("No single element");
    }
    public static int  optimal() {
        int[] nums = {1, 1, 2, 2, 4, 4, 6, 6, 7,7, 8, 8};
        int n = nums.length;
        if (n==1){
           return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if (nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        int low=1;
        int high=n-2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if (nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
            if ((mid%2==1 && nums[mid-1]==nums[mid]) || (mid%2==0 && nums[mid]== nums[mid+1])){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
