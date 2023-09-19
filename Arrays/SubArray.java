public class SubArray {

    public static void printSubArray(int arr[]) {
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                for (int range = start; range <= end; range++) {
                    System.out.print(arr[range] + " ");
                }

                System.out.println();
            }

            System.out.println();
        }
    }

    public static int countSubArray(int arr[]) {
        int N = arr.length;
        return (N * (N + 1) / 2);

        //Time: O(1)
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        printSubArray(arr);
        System.out.println("Total SubArray: " + countSubArray(arr));
    }
}

/*
 * SubArray -> It is a continuous part of the array.
 * 
 * Example: [1 2 3 4 5]
 * SubArray: 1 -> right
 *           1 2 -> right
 *           2 3 4 -> right
 *           1 2 5 -> wrong
 *           2 4 5 -> wrong
 * Total Subarray = Sum of N number where 'N' is the length of the
 *                  array.
 * 
 * Approach(Brute-force):
 * 
 * 1.First loop start = 0 to N; (Outerloop)
 * 2.Second loop end = start to N; (Inner loop of first)
 * 3.Third loop print value from start to end (Inner loop of second)
 * 
 * Time: O(N^3)
 * Space: O(1)
 * 
 * 
 */