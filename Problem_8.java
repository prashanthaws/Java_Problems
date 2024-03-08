package Java_Assignment;
//String a = "Welcome To Java" , count the number of space present in the sentense and print
// only "Welcome" using array.
public class Problem_8
{
    //String a = "Welcome To Java" , count the number of space present
    // in the sentense and print only "Welcome" using array.

    public static void main(String[] args)
    {
     String a = "Welcome To Java";
     int space_count = 0;
     for(int i=0;i<a.length();i++)
     {
         //verify whether the character is space
         if(a.charAt(i)==' ')
         {
            space_count++;
         }
     }
        System.out.println("Total Number of space count "+space_count);

        String[] first_word = a.split(" ");
        if (first_word.length > 0)
        {
            System.out.println("First word: " + first_word[0]);
        } else {
            System.out.println("First word not found.");
        }
    }
}
