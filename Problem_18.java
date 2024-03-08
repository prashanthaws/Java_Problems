package Java_Assignment;

//Write a program to print – (Use appropriate String methods)
//Only First name from “Sachin Tendulkar”
//Only Second name from “Rahul Dravid”
public class Problem_18
{
    public static void main(String[] args) {
        // Full name examples
        String fullName1 = "Sachin Tendulkar";
        String fullName2 = "Rahul Dravid";

        // Print only the first name
        String firstName1 = getFirstName(fullName1);
        System.out.println("First Name from \"" + fullName1 + "\": " + firstName1);

        // Print only the second name
        String secondName2 = getSecondName(fullName2);
        System.out.println("Second Name from \"" + fullName2 + "\": " + secondName2);
    }

    // Function to get the first name from a full name
    private static String getFirstName(String fullName) {
        String[] names = fullName.split(" ");
        return names.length > 0 ? names[0] : "";
    }

    // Function to get the second name from a full name
    private static String getSecondName(String fullName) {
        String[] names = fullName.split(" ");
        return names.length > 1 ? names[1] : "";
    }
}
