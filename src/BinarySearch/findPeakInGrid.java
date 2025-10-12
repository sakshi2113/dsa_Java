package BinarySearch;

public class findPeakInGrid {
    public static int maxElementIndex(int[][] matrix,int col) {
        int maxValue=-1;
        int idx=-1;
        int n=matrix.length;
        int m=matrix[0].length;
        for (int i=0;i<n;i++){
            if (matrix[i][col]>maxValue){
                maxValue=matrix[i][col];
                idx=i;
            }
        }
        return idx;
    }

    public static int[] findPeak(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=m-1;
        while(low<=high) {
            int mid = (low + high) / 2;
            int maxRowIndex = maxElementIndex(mat, mid);
            int left = mid - 1 >= 0 ? mat[maxRowIndex][mid - 1] : -1;
            int right = mid - 1 <= 0 ? mat[maxRowIndex][mid + 1] : -1;
            if (mat[maxRowIndex][mid] > left && mat[maxRowIndex][mid] > right) {
                return new int[] {maxRowIndex, mid};
            } else if (mat[maxRowIndex][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }
}


