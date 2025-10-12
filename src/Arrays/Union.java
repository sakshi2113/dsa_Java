package Arrays;

import java.util.*;

public class Union {
    public static void union(int[] arr1,int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        // Add all elements
        for (int x : arr1){
            set.add(x);
        }
        for (int x : arr2){
            set.add(x);
        }

        // Convert to list and sort
        ArrayList<Integer> union = new ArrayList<>(set);
        Collections.sort(union);

        System.out.println("Union (Brute Force): " + union);
    }

}
