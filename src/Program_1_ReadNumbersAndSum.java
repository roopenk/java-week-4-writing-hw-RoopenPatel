import java.util.Scanner;

/**
 * Read 10 numbers from console entered by user and print the sum of those numbers
 * use the haNextInt() method from the scanner to check if the user has entered the int value
 * If hasNextInt() returns false, print the message invalid number, continue reading until you have read 10 numbers
 * use the nextInt() method to get number and add it in the sum
 * before the user enters each number, print the message "Enter Number #1 : " and so on up to 10
 * hint:
 * use a while loop
 * use a counter variable for counting the valid numbers
 * close the scanner when you don't need it anymore
 * create a class with name ReadingUserInputChallenge
 */
public class Program_1_ReadNumbersAndSum {
    public static void readTenNumbersAndSum() {
        // scanner declaration for accepting the input from the console
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true) {
            int order = counter + 1;
            System.out.println("Please Enter Number #" + order + " : ");
            boolean isAnInt = scan.hasNextInt();
            if (isAnInt) {
                int number = scan.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }
            scan.nextLine();
        }
        System.out.println("Sum = " + sum);
        // closing the scanner object
        scan.close();
    }

    public static void main(String[] args) {
        readTenNumbersAndSum();
    }
}