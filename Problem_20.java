package Java_Assignment;
//Write a program to verify if the name of Cristiano Ronaldo
// is equal to Ronaldo Nazario (Use appropriate String methods)
public class Problem_20
{
    public static void main(String[] args) {
        // Names to be compared
        String name1 = "Cristiano Ronaldo";
        String name2 = "Ronaldo Nazario";

        // Verify if the names are equal
        if (areNamesEqual(name1, name2)) {
            System.out.println("The names are equal.");
        } else {
            System.out.println("The names are not equal.");
        }
    }

    // Function to verify if two names are equal
    private static boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }
}
