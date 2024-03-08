package Java_Assignment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//Write a Java Program to Print Current Date and return it as a String.
public class Problem_14
{
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Format the date using a DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formatter);

        // Print the current date
        System.out.println("Current Date: " + formattedDate);

        // Return the current date as a string (optional)
        String currentDateAsString = getCurrentDateAsString();
        System.out.println("Current Date (as a string): " + currentDateAsString);
    }

    // Function to return the current date as a string
    private static String getCurrentDateAsString() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return currentDate.format(formatter);
    }
}
