package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Leaders {
    public static void leader() {
        int[] arr={10,22,12,3,0,6};
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            int leader = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > leader) {
                    leader = -1;
                    break;
                }
            }
            if (leader != -1) {
                ans.add(leader);
            }
        }
        for (int i : ans){
            System.out.print(i+" ");
        }
    }
}
