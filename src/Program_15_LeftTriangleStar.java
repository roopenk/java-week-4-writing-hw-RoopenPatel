import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class Program_15_LeftTriangleStar {
    public static void leftTriangle(int x) {
        int i, j;
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        // Scanner declaration to accept inputs from the console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The Number Of Rows : ");
        int a = scan.nextInt();
        leftTriangle(a);
        // closing the scanner object
        scan.close();
    }
}
