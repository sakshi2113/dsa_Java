package BinarySearch;

public class MakeBouquets {
    public static void minDays() {
        int[] bloomDay={7,7,7,7,13,11,12,7};
        int m=2;
        int k=3;
        int n = bloomDay.length;

        // Not enough flowers
        if (n < m * k){
            System.out.println("no bouquet is possible");
            return;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find min & max bloom days
        for (int day=0;day<n;day++) {
            min = Math.min(min, bloomDay[day]);
            max = Math.max(max, bloomDay[day]);
        }

        int low = min, high = max, ans = -1;

        // Binary search on days
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (findBouquet(bloomDay, k, mid) >= m) {
                ans = mid;      // possible answer
                high = mid - 1; // try smaller days
            } else {
                low = mid + 1;  // need more days
            }
        }
        System.out.println("minimum no od days required to make "+ m+" bouquet is "+ans);
    }

    // Count how many bouquets we can make by "day"
    public static int findBouquet(int[] bloomDay, int k, int day) {
        int count = 0, noOfB = 0;
        for (int bloom : bloomDay) {
            if (bloom <= day) {
                count++;
                if (count == k) {
                    noOfB++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        return noOfB;
    }
}
