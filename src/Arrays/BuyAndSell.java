package Arrays;

public class BuyAndSell {
    public static int buyAndSell(int[] arr2) {
        int mini=arr2[0];
        int profit=0;
        for (int i=1;i<arr2.length;i++){
            int cost=arr2[i]-mini;
            profit=Math.max(cost,profit);
            mini=Math.min(mini,arr2[i]);
        }
        return profit;
    }
}
