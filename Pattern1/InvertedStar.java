public class InvertedStar {
    public static void main(String[] args) {
        InvertedStar.invertedStar(10);
    }

    public static void invertedStar(int input) {

        for (int line = input; line >= 1; line--) {

            // print star
            for (int star = line; star >= 1; star--) {
                System.out.print("*");
            }

            System.out.println(); // for next line
        }
    }
}

/*
 * Problem:
 * ****
 * ***
 * **
 * *
 * 
 * Given input = 4;
 * 
 * Approach:
 * 1.There are total 4 lines or n lines outer loop will be run n times.
 * 2.The top line star is euqal to n input times and decreased when going to
 * bottom
 * 3.Print 'star' character
 */