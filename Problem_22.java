package Java_Assignment;
//Write a program to print “Narendra Modi” to - (Use appropriate String methods)
//UpperCase & the LowerCase
public class Problem_22
{
    public static void main(String[] args) {
        // Original name
        String originalName = "Narendra Modi";

        // Convert to Uppercase
        String upperCaseName = toUpperCase(originalName);
        System.out.println("Uppercase: " + upperCaseName);

        // Convert to Lowercase
        String lowerCaseName = toLowerCase(originalName);
        System.out.println("Lowercase: " + lowerCaseName);
    }

    // Function to convert a string to Uppercase
    private static String toUpperCase(String originalString) {
        return originalString.toUpperCase();
    }

    // Function to convert a string to Lowercase
    private static String toLowerCase(String originalString) {
        return originalString.toLowerCase();
    }
}
