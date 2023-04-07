import java.util.Scanner;

/**
 * 14 Write a program in Java to display the pattern like a diamond.
 * While loop
 * <p>
 *          *
 *         ***
 *        *****
 *       *******
 *      *********
 *     ***********
 *    *************
 *     ***********
 *      *********
 *       *******
 *        *****
 *         ***
 *          *
 */
public class Program_14_DiamondPattern {
    public static void printDiamond(int r, char ch) {
        int i = 1;
        int j;
        while (i <= r) {
            j = 1;
            while (j++ <= r - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i++;
        }
        i = r - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= r - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i--;
        }
    }

    public static void main(String[] args) {
        // Scanner declaration to accept the inputs from the console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The Number Of Rows : ");
        int a = scan.nextInt();
        System.out.println("Please Enter A Symbol : ");
        char c = scan.next().charAt(0);
        printDiamond(a, c);
        // closing the scanner object
        scan.close();
    }
}
