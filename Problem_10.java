package Java_Assignment;
//How can we access private data from one class to other class?
// Explain and write down the code for it?
public class Problem_10
{

    public static void main(String[] args)
    {
        Problem_10_Private obj = new Problem_10_Private();
        int datavalue = obj.getPrivateData();
        System.out.println("Private data: "+datavalue);
        obj.setPrivateData(100);
        System.out.println("Modify private value "+datavalue);
    }
}
