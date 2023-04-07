import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci numbers)
 */
public class Program_9_FibonacciNumber {
    public static void isFibonacci(int count) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);
        // Loop starts from 2 as 0 and 1 have already been printed
        for (int i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {
        // Scanner declaration to accept the inputs from console
        Scanner scan = new Scanner(System.in);
        System.out.println("PLease Enter Fibonacci Numbers Count : ");
        isFibonacci(scan.nextInt());
        // closing the scanner object
        scan.close();
    }
}
