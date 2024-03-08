package Java_Assignment;
//From Class_A, call/print an integer variable which is present is Class B.
// Where use constructor to reset the value of the variable from Class_A to Class B.
public class Problem_2A extends Problem_2B
{
   public Problem_2A()
   {
       var = 500;
       System.out.println("Var value is Class A --> "+var);
   }

    public static void main(String[] args)
    {
        Problem_2A obj = new Problem_2A();
    }
}



