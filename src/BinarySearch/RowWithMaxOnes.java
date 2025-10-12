package BinarySearch;

public class RowWithMaxOnes {
    public static void maxOnes() {
        int[][] matrix={{0,0,1,1,1},
                        {0,0,0,0,0},
                        {0,0,0,1,1},
                        {0,1,1,1,1}};
        int idx=-1;
        int countMax=0;
        for(int i=0;i<matrix.length;i++) {
            int OnesCount = matrix[i].length - BSBasics.lowerBound(matrix[i], 1);
            if (OnesCount > countMax) {
                countMax = OnesCount;
                idx = i;
            }
        }
        System.out.println("row with maximum 1 :"+ idx);
    }

}
