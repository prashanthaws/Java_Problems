package Java_Assignment;
//Write a Program to Reverse The String "Welcome To Java"?
public class Problem_13
{
    public static void main(String[] args)
    {
        String originalString = "Problem_13";
        String reversedString = reverseString(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }

    private static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            // Swap characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move indices towards each other
            start++;
            end--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}
