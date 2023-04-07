import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the alphabet
 * print vowel or consonant depending on the user input
 * if the user input is not a letter (Between a to z or A to Z) or is a string of length > 1, print an error message
 * for e.g.
 * Input an alphabet : p
 * Expected Output:
 * Input letter is Consonant
 */
public class Program_3_FindVowelOrConsonant {
    public static void checkVowelOrConsonant(String letter) {
        // checking the length of the string
        // In case the user has entered more than one character
        /**   if (letter.length() > 1) {
         System.out.println("Error..!, Not A Single Character");
         // if the user enters a symbol
         } else if (!(isItALetter(letter))) {
         System.out.println("Error...!, Not A Letter, PLease Enter Uppercase Or Lowercase Letter");
         } else if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
         {
         System.out.println("Input Letter Is A Vowel");
         } else
         {
         System.out.println("Input Letter Is A Consonant");
         }
         }*/
        if (letter.length() > 1) {
            System.out.println("Error. Not a single character");
            //if user enters a symbol
        } else if (!(isItALetter(letter))) {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter");
        } else if (letter.equals("a") || letter.equals("e") || letter.equals("i")
                || letter.equals("o") || letter.equals("u")) {
            System.out.println("Input letter is a vowel");
        } else {
            System.out.println("Input letter is a consonant");
        }
    }

    // This method will check if it's a letter or not
    public static boolean isItALetter(String l) {
        return l.charAt(0) > 96 && l.charAt(0) < 123;
    }

    public static void main(String[] args) {
        // scanner declaration for accepting the inputs from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Any Character : ");
        String str = scan.next().toLowerCase();
        // Calling the static method directly
        checkVowelOrConsonant(str);
        // closing the scanner object
        scan.close();
    }
}

