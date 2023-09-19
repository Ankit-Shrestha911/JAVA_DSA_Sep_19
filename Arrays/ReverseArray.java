public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex <= endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;

            startIndex++;
            endIndex--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.println("Before:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
        reverseArray(arr);
        System.out.println("After:");

        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}

/*
 * Brute force:
 * 1.Creating new array of the size of reverse array.
 * 2.Make a variable that point to the end of the reverse array.
 * 3.Create a loop that run to the length of array and do copy
 *   from end index of reverse array to the new array.
 * 
 * Time: O(N)
 * Space: O(N)
 * 
 * Approach:(Optimize)
 * 1. Make two variable that track start and end index of the array.
 * 2. Make swap between start index element and end index of      
 *    element until start is not going to exceed the end.
 * 3. Increment the start and decrement the end.
 * 
 * Time: O(N)
 * Space: O(1)
 */
