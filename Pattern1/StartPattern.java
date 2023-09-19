public class StartPattern{
    public static void main(String args[]){
        starPattern(10);
 }

 public static void starPattern(int input) {
    if(input < 1) return;

    //outer loop
    for (int line = 0; line < input; line++) {
        //inner loop
        for (int star = 0; star <= line; star++) {
            System.out.print("*");
        }

        System.out.println();
    }
 }
}

/*
 * Basic approach for solving pattern question:
 * 1.First check how many line in the pattern.(Outer loop run line number of times)
 * 2.Check how many character need to print in each line.(Inner loop run character number of times)
 * 3.What to print means like print star,number of any other character.
 * Note: Print next line outside the inner loop
 * 
 * Problem:
 * *
 * **
 * ***
 * ****
 * 
 * Approach:
 * 1.Here total number of lines are 4 (outer loop will be run 4 times or given n times).
 * 2.In each lines we need to print star as line number times {for example line number 2 print star 2 times}
 * 3.what to print, Here need to print star character. 
 */