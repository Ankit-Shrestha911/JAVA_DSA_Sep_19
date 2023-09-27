public class QuickSort {

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int count = 0;

        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot)
                count++;
        }

        int pivotIndex = start + count;
        int temp = arr[pivotIndex];
        arr[pivotIndex] = pivot;
        arr[end] = temp;

        int i = start, j = end;

        while (i < pivotIndex && j > pivotIndex) {

            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i < pivotIndex && j > pivotIndex) {
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
            }

            i++;
            j--;
        }

        return pivotIndex;
    }

    public static int partition1(int arr[], int s, int e) {
        int pivot = e;
        int makeSpace = s-1;

        for (int i = s; i < e; i++) {
            if (arr[i] <= arr[pivot]) {
                makeSpace++;
                int temp = arr[makeSpace];
                arr[makeSpace] = arr[i];
                arr[i] = temp;
            }
        }

        makeSpace++;
        int temp1 = arr[makeSpace];
        arr[makeSpace] = arr[pivot];
        arr[pivot] = temp1;

        return makeSpace;
    }

    public static void doQuickSort(int arr[], int start, int end) {
        if (start >= end)
            return;

        int pivot = partition1(arr, start, end);
        doQuickSort(arr, start, pivot - 1);
        doQuickSort(arr, pivot + 1, end);
    }

    public static void main(String[] args) {
        int prices[] = { 23, 20, 100, 60, -2, 16, 40, 17, 16, 0, 12, 20, -1, -1 };
        // int prices[] = { 1, 2, 3, 4 };
        System.out.println("Before:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
        System.out.println("After:");
        doQuickSort(prices, 0, prices.length - 1);
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}
