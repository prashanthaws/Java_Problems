package Java_Assignment;
//Write a java program to add two float numbers like 8.6 and 9.7
public class Problem_1
{

    public static void main(String[] args)
    {
        Problem_1 atf = new Problem_1();
        atf.add_two_float_num(8.6,9.7);
    }

    public void add_two_float_num(double a, double b)
    {
        System.out.println(a+b);
    }
}
