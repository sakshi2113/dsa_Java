package Arrays;
import java.util.*;
public class MajorityElement {
    //using Hashmap
//    public static void majorityEle(int[] arr) {
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for (int i:arr){
//            map.put(i,map.getOrDefault(i,0)+1);
//        }
//        System.out.println(map);
//        for (Map.Entry<Integer,Integer> e: map.entrySet()){
//            if (e.getValue()>=(arr.length/2)){
//                System.out.println(e.getKey());
//            }
//        }
//        System.out.println("-1");
//    }
    public static int majorityEle(int[] arr1) {
        int count=0;
        int el=0;
        for (int i=0;i<arr1.length;i++){
            if (count==0){
                count++;
                el=arr1[i];
            }
            else if (arr1[i]==el){
                count++;
            }
            else {
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<arr1.length;i++){
            if (arr1[i]==el){
                count1++;
            }
        }
        if (count1>(arr1.length/2)){
            return el;
        }
        return -1;
    }
}
