package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void longestSequence() {
        int[] arr={102,4,100,101,3,1,2};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int longest=0;
//        int cnt=0;
//        int lastSmallest=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if (arr[i]-1==lastSmallest){
//                cnt++;
//                lastSmallest=arr[i];
//            }
//            else if(arr[i]!=lastSmallest){
//                cnt=1;
//                lastSmallest=arr[i];
//            }
//            longest=Math.max(longest,cnt);
//        }
//
//        System.out.println(longest);

        //optimal
        int n=arr.length;
        if (n == 0){
            System.out.println("empty");
        }
        int longest=0;
        HashSet<Integer> set= new HashSet<>();
        for (int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for (int it :set){
            if (!set.contains(it-1)) {
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        System.out.println(longest);
    }
}
