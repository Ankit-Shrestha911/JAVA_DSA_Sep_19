public class TrapRainWater {
    //Brute-Force
    static int getTapRainWater(int arr[]) {
        int result = 0;
        for (int i = 1; i < arr.length; i++) {
            int leftMaxHeight = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                leftMaxHeight = Math.max(leftMaxHeight, arr[j]);
            }
            int rightMaxHeight = arr[i];
            for (int k = i + 1; k < arr.length; k++) {
                rightMaxHeight = Math.max(rightMaxHeight, arr[k]);
            }

            int waterLevel = Math.min(leftMaxHeight, rightMaxHeight);
            result += waterLevel - arr[i];

        }
        return result;
    }

    //Optimize
    static int getTapRainWater2(int arr[]) {
        int result = 0;
        int leftMaxHeight[] = new int[arr.length];
        int rightMaxHeigth[] = new int[arr.length];
        leftMaxHeight[0] = arr[0];
        rightMaxHeigth[arr.length - 1] = arr[arr.length - 1];

        for (int i = 1; i < arr.length; i++) {
            leftMaxHeight[i] = Math.max(leftMaxHeight[i - 1], arr[i]);
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            rightMaxHeigth[i] = Math.max(rightMaxHeigth[i + 1], arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            result += Math.min(leftMaxHeight[i], rightMaxHeigth[i]) - arr[i];

        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 0, 3, 1, 6, 2, 4 };
        // int arr[] = { 4, 2, 0, 5, 4 };
        System.out.println("Result: " + getTapRainWater(arr));

    }
}

/*
 *
 * Brute-Force:
 * Time:O(N^2)
 * Space: O(1)
 * 
 * Approach:
 * 
 * Let current index is the highest bar of the left side and the right
 * side, use first loop to check left side from index-1 to 0 and 
 * compare max between them same take another loop for the right from 
 * index+1 to the size of the array and compare max between them.
 * 
 * Water level = min(leftside, righiside)- current bar
 * 
 * Approach(Optimize):
 * 
 * N = arr.length
 * 1. Here we maintain the two arrays of the size of given array
 *    that will track the left max height and another one track 
 *    the right max height and create result variable also.
 * 
 * 2. For leftMaxHeight[0] = arr[0] by default value because 
 *    there is no bar exist in left side of first index of the 
 *    array.For rightMaxHeight[N-1] = arr[N-1] because there is 
 *    no bar exist in the right of size of the last index.
 * 
 * 3. Start with index = 1 in a loop and storing the max between
 *    leftMaxHeight[index-1] and arr[index] in the leftMaxHeight
 *    [index].
 * 
 * 4. Start with index = N-2 in a loop and storing the max between
 *    rightMaxHeight[index+1] and arr[index] in the rightMaxHeight
 *    [index].
 * 
 * 5. In a loop start with index = 0 and taking min between
 *    (leftMaxHeight[index] and rightMaxHeight[index]) - arr[index]
 *    for calculating current bar water level and keep adding to
 *    the result variable.
 * 
 * Time: O(N)
 * Space: O(N)
 * 
 * 
 * 
 */
