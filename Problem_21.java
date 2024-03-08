package Java_Assignment;
//Write a program to replace the - (Use appropriate String methods)
//
//Original name from “Liverpool” to “Liverpool Football Club”
//Original name from “City” to “Manchester City”
public class Problem_21
{
    public static void main(String[] args) {
        // Original names
        String originalName1 = "Liverpool";
        String originalName2 = "City";

        // Replace original names
        String replacedName1 = replaceName(originalName1, "Liverpool Football Club");
        String replacedName2 = replaceName(originalName2, "Manchester City");

        // Print the replaced names
        System.out.println("Replaced Name 1: " + replacedName1);
        System.out.println("Replaced Name 2: " + replacedName2);
    }

    // Function to replace the original name in a string
    private static String replaceName(String originalString, String replacement) {
        return originalString.replace(originalString, replacement);
    }
}
