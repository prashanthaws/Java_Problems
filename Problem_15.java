package Java_Assignment;

import java.util.Random;
//Write a java program to create a random AlphaNumeric number and Retun it as a String
public class Problem_15
{
    public static void main(String[] args) {
        // Generate a random alphanumeric string
        String randomAlphaNumeric = generateRandomAlphaNumeric(10); // You can specify the desired length

        // Print the generated random alphanumeric string
        System.out.println("Random AlphaNumeric: " + randomAlphaNumeric);
    }

    // Function to generate a random alphanumeric string of a specified length
    private static String generateRandomAlphaNumeric(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();

        // Create a random object
        Random random = new Random();

        // Generate the random alphanumeric string
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            randomString.append(randomChar);
        }

        return randomString.toString();
    }
}
