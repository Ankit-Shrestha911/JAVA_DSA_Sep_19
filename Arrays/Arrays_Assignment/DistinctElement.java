import java.util.*;

public class DistinctElement {

    static boolean checkDistinctElement(int arr[]) {
        if (arr.length == 1)
            return true;

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }

        return true;
    }

    static boolean checkDistinctElement2(int arr[]) {
        HashSet<Integer> element = new HashSet<>();
        if (arr.length == 1)
            return true;

        for (int ele : arr) {
            if (element.contains(ele))
                return true;
            else
                element.add(ele);
        }

        return false;
    }

    class ArrayList<E> {
        private int size = 0;
        private int  default_Size = 10;
        private Object arr[];

        public ArrayList(){
            arr = new Object[default_Size];
        }

        public  void add(E value) {
            if(size >= arr.length) {
                ensureCapa();
                return;
            }
            arr[size++] = value;
            
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(checkDistinctElement2(arr));

    }
}

/*
 * Optimize-1
 * 
 * Sorting helps to find duplicate bcz after doing sorting all the
 * same element are in a group if twice exist else the element in a
 * increasing order.
 * Using loop to check same element is present in the alternative 
 * index or not, if exist then return true else false. 
 * Example: [2,1,4,1,4]
 * After sorting: [1,1,2,4,4]
 * 
 * Time: O(NLogN)
 * Space: O(1)
 * 
 * Optimize-2
 * 
 * Here using the hashset where inserting the element in a hashset 
 * from array using loop alongwith check whether hashset contain that 
 * element or not, if yes then return true else insert that element
 * in the hashset.
 * Time: O(N)
 * Space: O(N)
 */