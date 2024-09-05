import java.io.*;
import java.util.*;
public class Addition4
{
    int x,y,z;
    int add;
    add(x,y)
    {
        z=x+y;
        return z;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Addition4 a=new Addition4();
        System.out.println("Enter two integers for addition");
        x=sc.nextInt();
        y=sc.nextInt();
        z=a.add(x,y);
        System.out.println("Sum of" +x+ "and" +y+ "is"+z);
    }
}
