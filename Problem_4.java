package Java_Assignment;
//Write a function which accepts 3 parameters. 2 integers and 1 String.
// If String parameter is 'add' then it would add two integers. Similarly
// 'subs'/'multiplication'/'division'.
public class Problem_4
{
    public static void main(String[] args)
    {
        Problem_4 atp = new Problem_4();
        atp.add_two_numbers("ADD",6,2);
        atp.subs_two_numbers("SUBS",6,2);
        atp.mul_two_numbers("Mul",6,2);
        atp.div_two_numbers("Div",6,2);
    }

    public void add_two_numbers(String add, int a, int b)
    {
        System.out.println(a+b);
    }
    public void subs_two_numbers(String subs, int a, int b)
    {
        System.out.println(a-b);
    }
    public void mul_two_numbers(String mul, int a, int b)
    {
        System.out.println(a*b);
    }
    public void div_two_numbers(String div, int a, int b)
    {
        System.out.println(a/b);
    }
}
