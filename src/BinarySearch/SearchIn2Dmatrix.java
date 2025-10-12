package BinarySearch;

import javax.imageio.ImageTranscoder;

public class SearchIn2Dmatrix {
    public static void search() {
        int[][] matrix ={{3,4,7,9},{12,13,16,18},{20,21,23,29}};
        int target=23;
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0;
        int high=n*m-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            int row=mid/m;
            int col=mid%m;
            if(matrix[row][col]==target){
                System.out.println("target found");
                return;
            }
            else if(matrix[row][col]<target){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        System.out.println("target not found");
    }

}
