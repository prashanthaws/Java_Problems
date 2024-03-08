package Java_Assignment;
//Write a java program which will throw an exceptopn error
// for an AGE field if we pass age below 25 and above 55.
public class Problem_3
{
    public static void main(String[] args)
    {
        Problem_3 eefg = new Problem_3();
        eefg.Validate_age(24);
    }

    //function to check if person age below 25 and above 55
    public static int Validate_age(int age)
    {
        if(age<25 || age>55)
        {
            //throw Arithmetic exception
            throw new ArithmeticException("Age is not valid");
        }
        else
        {
            System.out.println("Person Age is within the range!!");
        }

        return age;
    }


}
