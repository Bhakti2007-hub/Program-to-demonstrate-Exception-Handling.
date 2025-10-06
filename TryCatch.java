import java.util.*;
public class TryCatch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 1st number ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		
		int d=a+b;
		try
		{
			int c=a/b;
			System.out.println("Division is: "+c);	
		}
		//if we got runtime error then catch block exicuted
		catch(ArithmeticException e)
		{
			System.out.println("We cannot divide by "+b);
		}
		System.out.println("Addition is: "+d);
	}
}