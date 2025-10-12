package BinarySearch;

public class AllocateBooks {
    public static void findPages() {
        int[] book={25,46,28,49,24};
        int students=4;
        int low=0;
        int high=0;
        for(int i=0;i<book.length;i++){
            low=Math.max(low,book[i]);
            high+=book[i];
        }
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (countStudents(book, students, mid) > students) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Each studens is given "+ low +"pages");

    }

    public static int countStudents(int[] book ,int k, int mid) {
        int cur=0;
        int count=1;
        for(int i=0;i<book.length;i++){
            cur+=book[i];
            if(cur>mid){
                cur=book[i];
                count++;
                if(count>k){
                    return count;
                }
            }
        }
        return count;
    }
}
