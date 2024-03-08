package Java_Assignment;
//Run a for loop from 500 to 1000 where if loop finds number 808
// then it will print the number found as 808
public class Problem_5
{
    public static void main(String[] args)
    {
     Problem_5 ral = new Problem_5();
     ral.run_loop();
    }

    public void run_loop()
    {
        for(int i=500;i<1000;i++)
        {
            if(i==808)
            {
                System.out.println("the number found as "+i);
            }
        }
    }
}
