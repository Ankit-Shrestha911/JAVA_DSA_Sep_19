import java.util.*;

public class Stocks {

    //Brute-Force buy and sell one at a time

    static int getMaxProfit(int arr[]) {
        int maxProfit = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int buyStock = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int sellingStock = arr[j];
                maxProfit = Math.max(maxProfit, sellingStock - buyStock);
            }
        }
        return maxProfit;
    }

    //Optimize buy and sell one at a time
    static int getMaxProfit2(int stocks[]) {
        if (stocks.length == 1)
            return 0;
        int maxProfit = 0;
        int buyPrice = stocks[0];

        for (int i = 1; i < stocks.length; i++) {
            if (buyPrice < stocks[i]) {
                int currentProfit = stocks[i] - buyPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            } else {
                buyPrice = stocks[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int stocks[] = { 7, 1, 5, 3, 6, 4 };
        // int stocks[] = { 7, 6, 4, 3, 1 };
        Arrays.sort(stocks);
        System.out.println(stocks[0]);
        // System.out.println(getMaxProfit(stocks));
    }
}
