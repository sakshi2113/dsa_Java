package Arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation() {
        int[] nums={2,1,5,4,3,0,0};
        int idx=-1;
        int n=nums.length;
        for (int i=n-2;i>=0;i--){
            if (nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        if (idx != -1) {
            for(int i=n-1;i>=idx;i--) {
                if (nums[i] > nums[idx]) {
                    int temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;
                    break;
                }
            }
        }

        ArraysUtils.reverse(nums,idx+1,n-1);
        ArraysUtils.printArray(nums);
    }
}
