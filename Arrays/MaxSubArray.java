public class MaxSubArray {
    //Brute-Force
    public static int printSubArray(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                int sum = 0;
                for (int range = start; range <= end; range++) {
                    sum += arr[range];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    //Optimize-1 using prefix sum

    public static int getSubArray(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];
        int current_sum = 0;
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                current_sum = start == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start - 1];
            }

            maxSum = Integer.max(maxSum, current_sum);
        }
        return maxSum;
    }

    //Optimize-2 Using kadane's algorithm

    public static int getSubArray2(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int current_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            current_sum += arr[i];
            maxSum = Math.max(maxSum, current_sum);

            if (current_sum < 0)
                current_sum = 0;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        System.out.println("Max SubArray: " + getSubArray2(arr));
    }
}

/*Brute-Force
 * Same approach as SubArray.java,here just need to maintain two
 * variable max_sum and current_sum whenever the current_sum is
 * going to maximum we update max_sum variable with current_sum
 * 
 * Time: O(N^3)
 * Space: O(1)
 * 
 * Optimize-1 Approach:
 * Everything same as above here we eliminate the range loop,using 
 * prefix sum array.
 * 
 * currentSum = prefix[end]-prefix[start-1]
 * Here exception is when start = 0 we cannot access prefix[0-1] it 
 * is invalid, so we check if start == 0 then use prefix[end] only.
 * 
 * Time: O(N^2)
 * Space: O(N)
 * 
 * Optimize-2 Approach(Kadane's):
 * 1.Make two variable maxSum = -infinity(Integer.MIN_VALUE) and
 *   currSum = 0.
 * 2.Use a loop from i = 0 to length of the array.
 * 3.Just add array value to the currSum and whenever the currSum is
 *   greater than maxSum then update maxSum with currSum also if 
 *   currSum is negative we reset its value to zero.
 * 
 * Time: O(N)
 * Space: O(1)
 */