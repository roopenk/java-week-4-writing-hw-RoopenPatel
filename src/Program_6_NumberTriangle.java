import java.util.Scanner;

/**
 * Write a java program to display the pattern like a triangle with a number
 * for e.g.
 * Input number of rows : 10
 * Expected output:
 * <p>
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Program_6_NumberTriangle {
    public static void numTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        // Scanner declaration to accept the inputs from console
        Scanner scan = new Scanner(System.in);
        System.out.println("PLease Enter The Number Of Rows : ");
        // Calling static method
        numTriangle(scan.nextInt());
        // closing the scanner object
        scan.close();
    }
}
