package Java_Assignment;

public class Problem_9
{
    //Print only 12345 from below string
    //"ABCDE12345"

    public static void main(String[] args)
    {
        String str = "ABCDE12345";

        String numericPart = str.replaceAll("[^0-9]", "");

        System.out.println("Print only 12345 from "+ str + ": " + numericPart);
    }
}
