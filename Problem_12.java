package Java_Assignment;

//Write a program to print 100 numbers using,
//While loop and
//For loop
public class Problem_12
{
    public static void main(String[] args)
    {
        int count = 1;

        // Using while loop to print numbers from 1 to 100
        while (count <= 100) {
            System.out.println("While loop values ==> "+count);
            count++;
        }
        for (int i = 1; i <= 100; i++) {
            System.out.println("For loop values ==> "+i);
        }
    }


}
