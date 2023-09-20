public class SelectionSort {

    static void doSelectionSort(int prices[]) {

        for (int i = 0; i < prices.length - 1; i++) {
            int smallestElementIndex = i;

            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] < prices[smallestElementIndex]) {
                    smallestElementIndex = j;
                }
            }

            int temp = prices[i];
            prices[i] = prices[smallestElementIndex];
            prices[smallestElementIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int prices[] = { 23, 20, 100, 60, 40, 0, 12, 20 };
        // int prices[] = { 1, 2, 3, 4 };
        System.out.println("Before:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
        System.out.println("After:");
        doSelectionSort(prices);
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}

/*
 * Search an smallest element from unsorted part `j=i+1` and place 
 * it(swap smallest element index with `i`), at the beginning of
 * the sorted part `i`.
 */