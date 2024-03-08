package Java_Assignment;

import java.util.*;
//Write a program where create an int type arraylist object. Then add 200 to 500 numbers into the ArrayList then Print the ArrayList.
//Perform the same for HashSet and print
//Perform the same for TreeSet and print
public class Problem_6
{
    public static void main(String[] args)
    {
     Arraly_list_object alo = new Arraly_list_object();
     List<Integer> lo = new ArrayList<Integer>();
     for(int i = 200;i<501;i++)
     {
         lo.add(i);
     }
        System.out.println(lo);


    Set<Integer> loh = new HashSet<Integer>();
     for(int j = 200;j<501;j++)
    {
        loh.add(j);
    }
        System.out.println(loh);

        Set<Integer> lot = new TreeSet<>();
        for(int j = 200;j<501;j++)
        {
            lot.add(j);
        }
        System.out.println(lot);
}
}
