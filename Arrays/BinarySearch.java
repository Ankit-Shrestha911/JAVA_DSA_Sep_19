public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 0, 6, 16, 20, 25 };
        int key = 0;

        System.out.println(binarySearch(arr, key));
    }

}

/*
 * Problem: Use binary search algorithm in a sorted array to find
 *          index of the given key. If key not found return -1.
 * 
 * Note: If we use end = length-1, use start<=end to reach the last
 *       index.Else if end = length, then use start<end
 * 
 * Example: [1,5,10,16];
 * key = 16
 * start = 0 end = 3 mid = 1 not match 5<16
 * start = 2 end = 3 mid = 2 not match 10<16
 * start = 3 end = 3 mid = 3 key matched
 * 
 * Example: [1,5,10,16,20]
 * key = 6
 * 
 * start = 0 end = 4 mid = 2 not match 10>6
 * start = 0 end = 1 mid = 0 not match 1<6
 * start = 1 end = 1 mid = 1 not match 5<6
 * start = 2 end = 1 loop terminated and return -1
 * 
 * Approach:
 * 1. We have start and end point, in a while loop the condition is
 *    start<=end to go through all element then calculate the mid
 *    point which act as a index of array, if an key is found we
 *    simply return their index, else if check the index of the 
 *    element is greater if yes then end = mid-1 or else
 *    start = mid+1 these process is going to happen until the 
 *    start is not crossing the end.
 * 
 * Time: O(logN)
 * Space: O(1)
 * 
 * 
 */
