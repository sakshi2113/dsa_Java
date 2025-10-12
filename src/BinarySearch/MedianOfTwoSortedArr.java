package BinarySearch;

public class MedianOfTwoSortedArr {
    public static void median() {
        int[] nums1={1,3,4,7,10,12};
        int[] nums2={2,3,6,15};
        int i=0;
        int j=0;
        int n=nums1.length+nums2.length;
        int index2=n/2;
        int index1=index2-1;
        int count=0;
        int idx1el=-1, idx2el=-1;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                if(count==index1){
                    idx1el=nums1[i];
                }
                if(count==index2){
                    idx2el=nums1[i];
                }
                count++;
                i++;
            }
            else {
                if(count==index1){
                    idx1el=nums2[j];
                }
                if(count==index2){
                    idx2el=nums2[j];
                }
                count++;
                j++;
            }
        }
        while(i<nums1.length){
            if(count==index1){
                idx1el=nums1[i];
            }
            if(count==index2){
                idx2el=nums1[i];
            }
            count++;
            i++;
        }
        while(j<nums2.length){
            if(count==index1){
                idx1el=nums2[j];
            }
            if(count==index2){
                idx2el=nums2[j];
            }
            count++;
            j++;
        }
        if (n%2==1){
            System.out.println(idx2el);
            return;
        }
        System.out.println((idx1el+idx2el)/2);

    }
}
