package Arrays;

import java.util.Arrays;

public class SetMatrixZeros {
//    public static void brute() {
//        int[][] matrix={{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};
//        System.out.println("original array: ");
//        ArraysUtils.print2DArray(matrix);
//        int n=matrix.length;
//        int m=matrix[0].length;
//        char marker ='a';
//        for (int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if (matrix[i][j]==0){
//                    //column
//                    for(int row=0;row<n;row++){
//                        if(matrix[row][j]!=0){
//                            matrix[row][j]=marker;
//                        }
//                    }
//                    //row
//                    for (int col=0;col<m;col++){
//                        if (matrix[i][col]!=0){
//                            matrix[i][col]=marker;
//                        }
//                    }
//                }
//            }
//        }
//        for(int i=0;i<n;i++) {
//            for (int j = 0; j < m; j++) {
//                if (matrix[i][j] == marker) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//        System.out.println("matrix set to zero: ");
//        ArraysUtils.print2DArray(matrix);
//    }

//    public static void better() {
//        int[][] matrix={{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};
//        System.out.println("original array: ");
//        ArraysUtils.print2DArray(matrix);
//        int n=matrix.length;
//        int m=matrix[0].length;
//        int[] row=new int[n];
//        int[] col=new int[m];
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                if (matrix[i][j]==0){
//                    row[i]=1;
//                    col[j]=1;
//                }
//            }
//        }
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                if(row[i]==1 || col[j]==1){
//                    matrix[i][j]=0;
//                }
//            }
//        }
//        System.out.println("matrix set to zero: ");
//        ArraysUtils.print2DArray(matrix);
//    }

    public static void optimal() {
        int[][] matrix={{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};
        System.out.println("original array: ");
        ArraysUtils.print2DArray(matrix);
        int n=matrix.length;
        int m=matrix[0].length;
//        int[] row=new int[n];  --> matrix[..][0]
//        int[] col=new int[m];  --> matrix[0][..]
        int col0=1;
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    //mark i-th row
                    matrix[i][0] = 0;
                    //mark j-th col
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }
        for(int i =1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]!=0){
                    //check for row and column
                    if(matrix[0][j]==0 || matrix[i][0]==0){
                        matrix[i][j]=0;
                    }

                }
            }
        }
        if (matrix[0][0]==0){
            for(int j=0;j<m;j++ ){
                matrix[0][j]=0;
            }
        }
        if(col0==0){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
        System.out.println("matrix set to zero: ");
        ArraysUtils.print2DArray(matrix);
    }
}
