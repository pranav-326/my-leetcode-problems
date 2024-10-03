package LeetCode;

public class bestTimeStock {
    public static int maxProfit(int[] prices) {
        int maxProfit=0;
        float minPrice=Float.POSITIVE_INFINITY;
        for (int i : prices) {
            if (i<minPrice) {
                minPrice=i;
            }
            float fprofit=i-minPrice;
            int profit=(int) fprofit;
            if (profit>maxProfit) {
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] arr={7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
}
