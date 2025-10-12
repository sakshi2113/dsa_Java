package BinarySearch;

public class SearchIn2DMatrixII {
    public static void brute() {
        int[][] matrix ={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=9;
        for(int i=0;i<matrix.length;i++){
            boolean found=BSBasics.bSearch(matrix[i],target);
            if(found==true){
                System.out.println("key found");
                return;
            }
        }
        System.out.println("key not found");

    }

    public static void optimal() {
        int[][] matrix ={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=9;
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                System.out.println("target found");
                return;
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else {
                col--;
            }
        }
        System.out.println("target not found");
    }
}
