public class LargestNumber {
    public static int findLargestNumber(int[] randomNumber) {
        int max_Value = Integer.MIN_VALUE;
        if (randomNumber.length == 0)
            return max_Value;

        // for (int ele : randomNumber) {
        // max_Value = Integer.max(ele, max_Value);
        // }

        for (int i = 0; i < randomNumber.length; i++) {
            if (randomNumber[i] > max_Value) {
                max_Value = randomNumber[i];
            }
        }

        return max_Value;
    }

    public static void main(String args[]) {
        int[] randomNumber = { 10, 30, 40, 1, -1, 16, 33, 50 };
        int result = findLargestNumber(randomNumber);

        System.out.println("Largest Number: " + result);

    }

}

/*
 * Problem: Find the largest element from an unsorted array.If an 
 *          array is empty then return the Integer minimum value.
 * 
 * Example: [10,1,30,6,15]
 * Output: [30]
 * 
 * Example: []
 * Output: [Interger smallest number]
 * 
 * Approach:
 * 1. Declare and initialize the max_value variable with Integer. 
 *    MIN_VALUE.
 * 2. Checking an edge case whether array is empty or not.
 * 3. Iterate through the element and comparing with max_value,if 
 *    current array index value is greater than max_value then,i 
 *    update max_value with the array index value.
 * 4. Doing same process till the end of the array.
 * 
 * Time: O(N)
 * Space: O(1)
 * 
 */