import java.io.*;
import java.util.*;
class EvenOdd
{
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer to check whether it is even or odd : ");
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num+" is an Even Number");
		}
		else
		{
			System.out.println(num+" is an Odd number");
		}
	}
}