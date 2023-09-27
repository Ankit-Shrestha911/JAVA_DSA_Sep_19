public class MergeSort {

    public static void doMerge(int arr[], int start, int end) {
        int index1 = start;
        int mid = start + (end - start) / 2;
        int index2 = mid + 1;
        int k = 0;
        int temp[] = new int[end - start + 1];

        while (index1 <= mid && index2 <= end) {

            if (arr[index1] <= arr[index2]) {
                temp[k++] = arr[index1++];
            } else {
                temp[k++] = arr[index2++];
            }

        }

        while (index1 <= mid) {
            temp[k++] = arr[index1++];
        }

        while (index2 <= end) {
            temp[k++] = arr[index2++];
        }

        k = 0;
        for (int l = start; l <= end; l++) {
            arr[l] = temp[k++];
        }
    }

    // public static void doMerge(int arr[], int start, int end) {
    //     int mid = start + (end - start) / 2;
    //     int len1 = mid - start + 1;
    //     int len2 = end - mid;

    //     int firstHalf[] = new int[len1];
    //     int secondHalf[] = new int[len2];

    //     int mainArrayIndex = start;

    //     for (int i = 0; i < len1; i++) {
    //         firstHalf[i] = arr[mainArrayIndex++];
    //     }

    //     mainArrayIndex = mid + 1;

    //     for (int i = 0; i < len2; i++) {
    //         secondHalf[i] = arr[mainArrayIndex++];
    //     }

    //     int index1 = 0;
    //     int index2 = 0;
    //     mainArrayIndex = start;
    //     while (index1 < len1 && index2 < len2) {
    //         if (firstHalf[index1] <= secondHalf[index2]) {
    //             arr[mainArrayIndex++] = firstHalf[index1++];
    //         } else {
    //             arr[mainArrayIndex++] = secondHalf[index2++];
    //         }

    //     }

    //     while (index1 < len1) {
    //         arr[mainArrayIndex++] = firstHalf[index1++];
    //     }

    //     while (index2 < len2) {
    //         arr[mainArrayIndex++] = secondHalf[index2++];
    //     }

    // }

    public static void doMergeSort(int arr[], int s, int e) {
        if (s >= e)
            return;

        int mid = s + (e - s) / 2;

        doMergeSort(arr, s, mid);
        doMergeSort(arr, mid + 1, e);
        doMerge(arr, s, e);
    }

    public static void main(String[] args) {
        int prices[] = { 5, 1, 4, 3, 2 };
        // int prices[] = { 1, 2, 3, 4 };
        System.out.println("Before:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
        System.out.println("After:");
        doMergeSort(prices, 0, prices.length - 1);
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}
