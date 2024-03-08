package Java_Assignment;
import java.time.LocalDate;
import java.time.Month;

//Write a program to select the current month out of 12 month in the year 2024
// using switch statements
public class Problem_16
{
    public static void main(String[] args) {
        // Get the current month using java.time.Month
        Month currentMonth = LocalDate.now().getMonth();

        // Display the current month using a switch statement
        switch (currentMonth) {
            case JANUARY:
                System.out.println("The current month is January.");
                break;
            case FEBRUARY:
                System.out.println("The current month is February.");
                break;
            case MARCH:
                System.out.println("The current month is March.");
                break;
            case APRIL:
                System.out.println("The current month is April.");
                break;
            case MAY:
                System.out.println("The current month is May.");
                break;
            case JUNE:
                System.out.println("The current month is June.");
                break;
            case JULY:
                System.out.println("The current month is July.");
                break;
            case AUGUST:
                System.out.println("The current month is August.");
                break;
            case SEPTEMBER:
                System.out.println("The current month is September.");
                break;
            case OCTOBER:
                System.out.println("The current month is October.");
                break;
            case NOVEMBER:
                System.out.println("The current month is November.");
                break;
            case DECEMBER:
                System.out.println("The current month is December.");
                break;
            default:
                System.out.println("Invalid month.");
        }
    }
}
