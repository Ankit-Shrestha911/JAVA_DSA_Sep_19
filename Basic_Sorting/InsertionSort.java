public class InsertionSort {

    public static void doInsertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int index = i;

            while (index > 0 && value < arr[index - 1]) {
                arr[index] = arr[index - 1];
                index--;
            }

            arr[index] = value;
        }
    }

    public static void main(String args[]) {
        int prices[] = { 23, 20, 100, 60, 40, 0, 12, 20, -1 };
        // int prices[] = { 1, 2, 3, 4 };
        System.out.println("Before:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
        System.out.println("After:");
        doInsertionSort(prices);
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}

/*
 * Approach:
 * 
 * We know one element is sorted in their own way, we need to take care of the 
 * rest N-1 elements that's why we started from the index `1` and compare with 
 * all previous element to find the right poisition for the element, here we need
 * to store the current `i`  index value.
 */