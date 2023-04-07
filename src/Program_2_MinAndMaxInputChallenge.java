import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum and maximum number
 * the user has entered
 * before the user enters the number print the message "Enter The Number"
 * if the user enters an invalid number, break out of the loop and print the min and max number
 * Hint :
 * use an endless while loop
 * create a class with the name MinAndMaxInputChallenge
 */
public class Program_2_MinAndMaxInputChallenge {
    public static void findMinAndMaxNumbers() {
        // scanner declaration to accept the inputs from the console
        Scanner scan = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        // while loop
        while (true) {
            System.out.println("Please Enter The Number : ");
            boolean isAnInt = scan.hasNextInt();
            if (isAnInt) {
                int number = scan.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else
                break;
            scan.nextLine(); // handle input
        }
        System.out.println("Min = " + min + " , Max = " + max);
        scan.close();
    }

    public static void main(String[] args) {
        findMinAndMaxNumbers();
    }
}
