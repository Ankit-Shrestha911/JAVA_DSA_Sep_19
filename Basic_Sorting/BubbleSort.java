public class BubbleSort {

    //Without optimization
    public static void doBubbleSort_WithoutOptimize(int prices[]) {

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = 0; j < prices.length - 1; j++) {
                if (prices[j] < prices[j + 1]) {
                    int temp = prices[j];
                    prices[j] = prices[j + 1];
                    prices[j + 1] = temp;
                }
            }
        }
    }

    //With optimization
    public static void doBubbleSort_WithOptimize(int prices[]) {

        for (int i = 0; i < prices.length - 1; i++) {
            boolean check = false;
            for (int j = 0; j < prices.length - 1 - i; j++) {
                if (prices[j] > prices[j + 1]) {
                    int temp = prices[j];
                    prices[j] = prices[j + 1];
                    prices[j + 1] = temp;
                    check = true;
                }
            }

            if (!check)
                return;
        }
    }

    public static void main(String args[]) {
        int prices[] = { 23, 20, 100, 60, 40, 0, 12, 20 };
        // int prices[] = { 1, 2, 3, 4 };
        System.out.println("Before:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
        System.out.println("After:");
        doBubbleSort_WithoutOptimize(prices);
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();

    }
}

/*
 * 
 * `doBubbleSort_WithoutOptimize`: This method implements the basic Bubble Sort 
 * algorithm without any optimization. It uses nested loops to compare adjacent 
 * elements and swap them if they are out of order. It continues this process until 
 * no more swaps are needed
 * 
 * `doBubbleSort_WithOptimize`: This method implements an optimized version of Bubble 
 * Sort. It also uses nested loops to compare and swap elements. The key optimization 
 * is in the inner loop's termination condition (`prices.length - 1 - i`), which 
 * means that as the outer loop progresses, the inner loop iterates fewer times. This 
 * is because, after each pass through the outer loop, the largest element "bubbles 
 * up" to the end of the array, so there's no need to compare it again in subsequent 
 * passes. This optimization reduces the number of unnecessary comparisons and swaps, 
 * making the sorting process more efficient.
 */