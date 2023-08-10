package Step3Arrays.Medium;

public class S6BuySellStock {
    public static void main(String[] args) {

    }
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int min = prices[0];

        for(int i=1;i<n;i++){
            max = Math.max(max,prices[i]-min);
            min = Math.min(min,prices[i]);
        }

        return max;
    }
}
