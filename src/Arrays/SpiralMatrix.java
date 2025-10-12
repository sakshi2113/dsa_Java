package Arrays;
import java.util.*;
public class SpiralMatrix {
    public static void spiralOrder() {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> list=new ArrayList<>();
        int top =0;
        int left=0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
        while(left<=right && top<=bottom){
            for (int j=left;j<=right;j++){
                list.add(matrix[top][j]);
            }
            top++;
            for (int i=top;i<=bottom;i++ ){
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom) {
                for (int j = right; j >=left; j--) {
                    list.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        System.out.println("spiral matrix: ");
        System.out.println(list);
    }
}
