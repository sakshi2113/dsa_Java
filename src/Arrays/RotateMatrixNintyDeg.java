package Arrays;

import org.w3c.dom.ls.LSOutput;

public class RotateMatrixNintyDeg {
//    public static void brute() {
//        int[][] matrix={ {1,2,3},{4,5,6},{7,8,9}};
//        System.out.println("original matrix: ");
//        ArraysUtils.print2DArray(matrix);
//        int  n=matrix.length;
//        int[][] ans= new int[n][n];
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                ans[j][n-1-i]=matrix[i][j];
//            }
//        }
//        ArraysUtils.print2DArray(ans);
//    }

    public static void optimal() {
        int[][] matrix={ {1,2,3},{4,5,6},{7,8,9}};
        System.out.println("original matrix: ");
        ArraysUtils.print2DArray(matrix);
        int  n=matrix.length;
        //transpose
        for( int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] =matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            int start=0;
            int end=n-1;
            while(start<end){
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }
        System.out.println("roteted matrix by ninty degree: ");
        ArraysUtils.print2DArray(matrix);
    }
}
