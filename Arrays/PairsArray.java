public class PairsArray {

    public static void printPairs(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }

    public static int countPairs(int[] arr) {
        int n = arr.length;

        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 8, 10, 16 };
        printPairs(arr);
        System.out.println(countPairs(arr));
    }
}

/*
 * Brute force:
 * 1. Make a first loop i = 0 to the length-1 of array.
 * 2. Make another loop inside first loop j = i+1 to the size of
 *    array.
 * 3. print array[i] and array[j] together
 * 
 * Time: O(N^2)
 * Space: O(1)
 * 
 * Optimal Approach:
 * 1.Formula (n*(n-1))/2 where 'n' is the length of the array.
 * 
 * Example: [1,2,3,4] n -> 4
 * Pairs: (1,2) (1,3) (1,4) -> 3 pairs
 *        (2,3) (2,4) -> 2 pairs
 *        (3,4) -> 1 pair
 * Total pairs = sum of n-1 number.
 * 
 * Time: O(1)
 * Space: O(1)
 */