package Java_Assignment;

import java.util.Scanner;
//Write a program to print even or odd number using if condition
public class Problem_17
{
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the user's input
        int number = scanner.nextInt();

        // Check if the number is even or odd using an if condition
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        // Close the scanner to avoid resource leakage
        scanner.close();
    }
}
