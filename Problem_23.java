package Java_Assignment;

import java.util.Scanner;
//Write a program to Catch any exception in java. Use try catch and finally statements
public class Problem_23
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Trying to perform some operations that might throw an exception
            System.out.print("Enter a number: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter another number: ");
            int denominator = scanner.nextInt();

            int result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (Exception e) {
            // Catching any exception and printing the error message
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // The finally block will be executed regardless of whether an exception occurs or not
            System.out.println("Finally block executed. Closing resources.");
            scanner.close();
        }
    }

    // Function to perform division
    private static int divideNumbers(int numerator, int denominator) {
        return numerator / denominator;
    }
}
