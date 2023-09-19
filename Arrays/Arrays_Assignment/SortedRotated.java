public class SortedRotated {
    static int binarySearch(int arr[], int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int SearchInSortedRotatedArray(int arr[], int target) {

        int rotatedPoint = minSearch(arr);

        if (arr[rotatedPoint] <= target && target <= arr[arr.length - 1]) {
            return binarySearch(arr, rotatedPoint, arr.length - 1, target);
        } else {
            return binarySearch(arr, 0, rotatedPoint - 1, target);
        }

    }

    static int minSearch(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid > 0 && arr[mid - 1] > arr[mid])
                return mid;
            else if (arr[mid] >= arr[left] && arr[mid] > arr[right])
                left = mid + 1;
            else
                right = mid - 1;
        }

        return left;
    }

    public static void main(String[] args) {
        // int arr[] = { 4, 5, 6, 0, 1, 2 };
        int arr[] = { 3, 1 };
        int target = 10;
        // System.out.println(minSearch(arr));
        System.out.println(SearchInSortedRotatedArray(arr, target));
    }
}

/*
 * Solution: https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
 * 
 * Optimize Approach:
 * 
 * We have given sorted Array which is rotated at k index means
 * there are two sorted array left and right
 * Exmaple: Orignal [1,2,3,4,5,6]
 * After rotation at index 4: [4,5,6,1,2,3]
 * left part:[4,5,6] right part: [1,2,3]
 * 
 * We know, at a point of rotation their previous value always 
 * greater han rotation index value like [6]>[1]
 * 
 * 1.Find rotated point:
 *    1.Using binary search algorithm with some modification
 *      We know rotated point previous value always greater than this, Means
 *      arr[mid-1] > arr[mid] so this is our roated point but here is catch
 *      we need to handle zero case when mid will be then we are going to access
 *      arr[0-1] index which is not valid so mid alaways be greater than zero.
 *   
 *   2.Now here a question either go left or right the position how to find it
 *     If our mid value is greater than the left and right value means we need 
 *     to search on the right side because if mid is greater than its previous
 *     value, means all the previous value is also smaller than itself and our 
 *     rotated point condition is arr[mid-1] value > arr[mid] value, if we going to 
 *     the left we never find rotated point bcz arr[mid-1] > arr[mid] never going 
 *     to be true.
 *  
 *   3.Why we always return left why not right? because if we choose right,there 
 *     are some cases where right value is going to be negative it will cause 
 *     error in array using left bcz it never  to to negative bcz of mid+1 .
 *     Example:[1,3] target = 10
 *     Output: -1
 *     Initially left = 0, right = array.length-1 which is 1
 *     while(0<1):
 *          mid = 0+(1-0)/2 ->0
 *          first if condition is not true bcz mid is not > than zero
 *          second else if condition arr[mid](1) >=arr[left](1) && arr[mid](1)>arr
 *          [right](3) which is not true so this is not going to execute.
 *          else:
 *             right = mid-1 -> 0-1 = -1
 *   
 *     while(0<-1) not true and we going to return -1 which give us error while 
 *     searching target     
 *     
 * 
 * 
 * 
 * 
 * 
 */