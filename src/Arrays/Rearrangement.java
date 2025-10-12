package Arrays;

public class Rearrangement {
 //   public static int[] rearange(int[] nums) {
 //       int posIndex=0,negIndex=0;
 //       int n=nums.length;
//        int[] pos=new int[n];
//        int[] neg=new int[n];
//
//        for (int i=0;i<n;i++) {
//            if (nums[i] < 0) {
//                neg[negIndex++] = nums[i];
//            } else {
//                pos[posIndex++] = nums[i];
//            }
//        }
//        // Step 2: Place alternately
//        int i = 0, j = 0, k = 0;
//
//        while (i < posIndex && j < negIndex) {
//            nums[k++] = pos[i++];
//            nums[k++] = neg[j++];
//        }
//
//        // If extra positives remain
//        while (i < posIndex) nums[k++] = pos[i++];
//
//        // If extra negatives remain
//        while (j < negIndex) nums[k++] = neg[j++];
//
//        return nums;

 //   }

    public static int[] rearange(int[] nums) {
        int posIndex=0,negIndex=1;
        int n=nums.length;
        int[] ans=new int[n];
        for (int i=0;i<n;i++){
            if (nums[i] < 0) {
                if (negIndex < n) {
                    ans[negIndex] = nums[i];
                    negIndex += 2;
                }
            } else {
                if (posIndex < n) {
                    ans[posIndex] = nums[i];
                    posIndex += 2;
                }
            }

        }
        return ans;
    }
}
