package BinarySearch;

public class CountOccurrenceInArr {
    public static int count(int[] arr,int target) {
        int first=FirstAndLastPosition.first(arr,target);
        int last=FirstAndLastPosition.last(arr,target);
        int[] ans={first,last};
        if (ans[0]==-1){
            return 0;
        }
        else {
            return last-first+1;
        }


    }
}
